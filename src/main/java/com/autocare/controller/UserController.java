package com.autocare.controller;

import org.springframework.web.bind.annotation.RestController;

import com.autocare.dto.UserDTO;
import com.autocare.entity.UserModel;
import com.autocare.repository.UserRepo;
import com.autocare.service.UserService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@CrossOrigin("*")
public class UserController {

    @Autowired
    UserService service;

    @Autowired
    UserRepo repo;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @GetMapping("hello")
    public String greet() {
        System.out.println("hello called");
        return "Hello Wolrd!";
    }

    @GetMapping("about")
    public String about() {
        System.out.println("abt called");
        return "About Me!";
    }

    private Map<String, Object> excludePassword(UserModel user) {
        Map<String, Object> userDetails = new HashMap<>();
        userDetails.put("id", user.getId());
        userDetails.put("username", user.getUsername());
        userDetails.put("email", user.getEmail());
        userDetails.put("address", user.getAddress());
        userDetails.put("mobile", user.getMobile());
        userDetails.put("role", user.getRole());
        // Add other fields as needed
        return userDetails;
    }

    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@RequestBody UserModel user) {
        System.out.println("REGISTER");
        try {
            service.registerUser(user);
            return ResponseEntity.ok(excludePassword(user));
        } catch (IllegalArgumentException e) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(e.getMessage());
        }
    }

    @PostMapping("/login")
    public ResponseEntity<?> loginUser(@RequestBody UserModel user) {
        System.out.println("LOGIN");
        Optional<UserDTO> existingUserDTO = repo.findUserDetailsWithoutImage(user.getEmail());

        if (!existingUserDTO.isPresent()) {
            // Returning a simple map with an error message
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                    .body(Map.of("message", "Email not registered!"));
        }

        UserDTO existingUser = existingUserDTO.get();

        System.out.println("User provided password: " + user.getPassword());

        // # Decoding
        if (passwordEncoder.matches(user.getPassword(), existingUser.getPassword())) {
            return ResponseEntity.ok(existingUser);
        } else {
            // Returning a simple map with an error message
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                    .body(Map.of("message", "Invalid password"));
        }
    }

    @GetMapping("/api/userModels/search/findByRole")
    public List<UserModel> findByRole(@RequestParam String role) {
        return service.findUsersByRole(role);
    }

     @PatchMapping("/update-password")
    public ResponseEntity<String> updatePassword(@RequestBody Map<String, String> requestBody) {
        String email = requestBody.get("email");
        String newPassword = requestBody.get("password");

        if (email == null || newPassword == null) {
            return ResponseEntity.badRequest().body("Email and password are required.");
        }

        service.updatePassword(email, newPassword);
        return ResponseEntity.ok("Password updated successfully.");
    }
}
