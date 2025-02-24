package com.autocare.request;

import java.util.List;

import com.autocare.dto.CartItem;

// PurchaseRequest.java - DTO for incoming requests
public class PurchaseRequest {
    private Long userId;
    private List<CartItem> items;
    private Double total;

    // Getters and setters
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public List<CartItem> getItems() {
        return items;
    }

    public void setItems(List<CartItem> items) {
        this.items = items;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
}
