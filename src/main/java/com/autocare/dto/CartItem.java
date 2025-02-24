package com.autocare.dto;

import lombok.Data;

@Data
// CartItem.java - DTO for cart items
public class CartItem {
    private String serviceName;
    private Double price;
}