package com.autocare.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.autocare.service.EmailVerificationRequest;
import com.autocare.service.EmailVerificationService;
import com.autocare.service.VerificationCodeRequest;
import com.autocare.service.VerificationResponse;

import jakarta.validation.Valid;

// Controller
@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200") // Adjust according to your Angular app URL
public class VerificationController {

    @Autowired
    private EmailVerificationService verificationService;

    @PostMapping("/send-verification")
    public ResponseEntity<?> sendVerificationCode(@Valid @RequestBody EmailVerificationRequest request) {
        try {
            verificationService.sendVerificationEmail(request.getEmail());
            return ResponseEntity.ok(new VerificationResponse("Verification code sent successfully", null));
        } catch (Exception e) {
            return ResponseEntity.badRequest()
                    .body(new VerificationResponse(e.getMessage(), null));
        }
    }

    @PostMapping("/verify-code")
    public ResponseEntity<?> verifyCode(@Valid @RequestBody VerificationCodeRequest request) {
        try {
            String token = verificationService.verifyCode(request.getEmail(), request.getCode());
            return ResponseEntity.ok(new VerificationResponse("Code verified successfully", token));
        } catch (Exception e) {
            return ResponseEntity.badRequest()
                    .body(new VerificationResponse(e.getMessage(), null));
        }
    }
}