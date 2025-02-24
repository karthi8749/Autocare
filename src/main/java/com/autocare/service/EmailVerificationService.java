package com.autocare.service;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

// Service
@Service
@Slf4j
public class EmailVerificationService {

    @Autowired
    private JavaMailSender emailSender;

    // In production, use Redis or a database instead of in-memory map
    private final Map<String, VerificationCode> verificationCodes = new ConcurrentHashMap<>();

    public void sendVerificationEmail(String email) {
        String code = generateRandomCode();
        LocalDateTime expiryTime = LocalDateTime.now().plusMinutes(5);

        verificationCodes.put(email, new VerificationCode(code, expiryTime));

        try {
            SimpleMailMessage message = new SimpleMailMessage();
            message.setFrom("noreply@yourapp.com");
            message.setTo(email);
            message.setSubject("Password Reset Verification Code");
            message.setText("Your verification code is: " + code + "\n\n" +
                    "This code will expire in 5 minutes.\n" +
                    "If you didn't request this code, please ignore this email.");

            emailSender.send(message);
            log.info("Verification email sent to: {}", email);
        } catch (MailException e) {
            log.error("Failed to send verification email to: {}", email, e);
            throw new RuntimeException("Failed to send verification email");
        }
    }

    public String verifyCode(String email, String code) {
        VerificationCode storedCode = verificationCodes.get(email);

        if (storedCode == null) {
            throw new RuntimeException("No verification code found for this email");
        }

        if (LocalDateTime.now().isAfter(storedCode.getExpiryTime())) {
            verificationCodes.remove(email);
            throw new RuntimeException("Verification code has expired");
        }

        if (!storedCode.getCode().equals(code)) {
            throw new RuntimeException("Invalid verification code");
        }

        // Remove the used code
        verificationCodes.remove(email);

        // Generate a token for password reset
        return generateToken();
    }

    private String generateRandomCode() {
        return String.format("%04d", new Random().nextInt(10000));
    }

    private String generateToken() {
        return UUID.randomUUID().toString();
    }
}