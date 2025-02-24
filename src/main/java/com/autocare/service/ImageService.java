package com.autocare.service;

import java.io.IOException;
import java.util.Base64;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ImageService {
    
    public String uploadImage(MultipartFile file) throws IOException {
        String fileName = StringUtils.cleanPath(file.getOriginalFilename());
        
        if(fileName.contains("..")) {
            throw new IllegalArgumentException("Filename contains invalid path sequence " + fileName);
        }
        
        return Base64.getEncoder().encodeToString(file.getBytes());
    }
    
    public byte[] decompressImage(byte[] data) {
        return Base64.getDecoder().decode(data);
    }
}