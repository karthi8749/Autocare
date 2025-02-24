package com.autocare.repository;

import java.util.List;

// PurchaseRepository.java
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.autocare.entity.Purchase;

@Repository
public interface PurchaseRepository extends JpaRepository<Purchase, Long> {
    List<Purchase> findByUserId(Long userId);

    // Optional: Add custom queries if needed
    @Query("SELECT p FROM Purchase p WHERE p.userId = :userId ORDER BY p.purchaseDate DESC")
    List<Purchase> findRecentPurchasesByUser(@Param("userId") Long userId);
}
