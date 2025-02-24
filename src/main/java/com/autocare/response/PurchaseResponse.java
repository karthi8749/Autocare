package com.autocare.response;

import java.time.LocalDateTime;
import java.util.List;

import com.autocare.dto.CartItem;
import com.autocare.entity.Purchase;

// Optional: PurchaseResponse.java - DTO for responses
public class PurchaseResponse {
    private Long purchaseId;
    private LocalDateTime purchaseDate;
    private Double totalAmount;
    private List<CartItem> items;

    public PurchaseResponse(Purchase purchase) {
        this.purchaseId = purchase.getId();
        this.purchaseDate = purchase.getPurchaseDate();
        this.totalAmount = purchase.getTotalAmount();
        this.items = purchase.getItems();
    }

    // Getters
    public Long getPurchaseId() {
        return purchaseId;
    }

    public LocalDateTime getPurchaseDate() {
        return purchaseDate;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public List<CartItem> getItems() {
        return items;
    }
}