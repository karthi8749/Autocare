package com.autocare.service;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;

// Entity to store verification codes (you can use Redis or database instead)
@Data
@AllArgsConstructor
class VerificationCode {
    private String code;
    private LocalDateTime expiryTime;
}