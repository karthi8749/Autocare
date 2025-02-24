package com.autocare.entity;

import java.time.LocalDateTime;
import java.util.List;

import org.hibernate.annotations.Type;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import com.autocare.dto.CartItem;

// Spring Boot Entity

// Purchase.java - Updated Entity with proper JSON handling
import com.vladmihalcea.hibernate.type.json.JsonType;

@Data
@Entity
@Table(name = "purchases")
public class Purchase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "user_id")
    private Long userId;
    
    @Column(name = "total_amount")
    private Double totalAmount;
    
    @Column(name = "purchase_date")
    private LocalDateTime purchaseDate;
    
    @Type(JsonType.class)
    @Column(name = "items", columnDefinition = "jsonb")
    private List<CartItem> items;

}
