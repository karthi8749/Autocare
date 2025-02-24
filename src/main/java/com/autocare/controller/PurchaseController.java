package com.autocare.controller;

import org.springframework.http.HttpHeaders;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.autocare.entity.Purchase;
import com.autocare.request.PurchaseRequest;
import com.autocare.response.PurchaseResponse;
import com.autocare.service.PurchaseService;
import org.springframework.http.MediaType;

import jakarta.annotation.Resource;

// Spring Boot Controller
@RestController
@RequestMapping("/api/purchases")
@CrossOrigin
public class PurchaseController {

    @Autowired
    private PurchaseService purchaseService;

    @PostMapping("/save")
    public ResponseEntity<PurchaseResponse> savePurchase(@RequestBody PurchaseRequest request) {
        PurchaseResponse savedPurchase = purchaseService.savePurchase(request);
        return ResponseEntity.ok(savedPurchase);
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<Purchase>> getUserPurchases(@PathVariable Long userId) {
        List<Purchase> purchases = purchaseService.findByUserId(userId);
        return ResponseEntity.ok(purchases);
    }

    @GetMapping("/{purchaseId}/receipt")
    public ResponseEntity<?> downloadReceipt(@PathVariable Long purchaseId) {
        try {
            ByteArrayResource resource = purchaseService.generateReceipt(purchaseId);

            return ResponseEntity.ok()
                    .header(HttpHeaders.CONTENT_DISPOSITION,
                            "attachment; filename=receipt-" + purchaseId + ".pdf")
                    .contentType(org.springframework.http.MediaType.APPLICATION_PDF)
                    .contentLength(resource.contentLength())
                    .body(resource);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }
}