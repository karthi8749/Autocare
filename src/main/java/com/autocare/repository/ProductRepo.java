package com.autocare.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.autocare.entity.ProductModel;

@Repository
public interface ProductRepo extends JpaRepository<ProductModel, Long> {
    List<ProductModel> findByCategory(String category);
}