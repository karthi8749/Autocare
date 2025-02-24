package com.autocare.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.autocare.entity.GetQuoteModel;

@Repository
public interface GetQuoteRepo extends JpaRepository<GetQuoteModel, Integer> {
}
