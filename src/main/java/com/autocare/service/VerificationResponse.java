package com.autocare.service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// Response DTO
@Data
@AllArgsConstructor
@NoArgsConstructor
public class VerificationResponse {
    private String message;
    private String token;
}