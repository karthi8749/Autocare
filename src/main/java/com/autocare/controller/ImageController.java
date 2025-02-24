package com.autocare.controller;

import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.autocare.entity.UserModel;
import com.autocare.repository.UserRepo;
import com.autocare.service.ImageService;

@RestController
@RequestMapping("/api/products")
@CrossOrigin(origins = "http://localhost:4200")
public class ImageController {

    @Autowired
    private UserRepo repo;

    @Autowired
    private ImageService imageService;

    @PostMapping("/upload/{id}")
    public ResponseEntity<?> uploadImage(@PathVariable long id,
            @RequestParam("image") MultipartFile file) {
        try {
            Optional<UserModel> product1 = repo.findById(id);
            if(product1.isPresent()){
               UserModel product = product1.get();
            }

            product.setImageName(file.getOriginalFilename());
            product.setImageType(file.getContentType());
            product.setImageData(file.getBytes());

            UserModel savedProduct = repo.save(product);

            return ResponseEntity.ok()
                    .body(Map.of("message", "Image uploaded successfully",
                            "productId", savedProduct.getId()));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Could not upload image: " + e.getMessage());
        }
    }

    @GetMapping("/image/{id}")
    public ResponseEntity<?> getImage(@PathVariable long id) {
        try {
            UserModel product = repo.findById(id).get();

            return ResponseEntity.ok()
                    .contentType(MediaType.valueOf(product.getImageType()))
                    .body(product.getImageData());
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }
}