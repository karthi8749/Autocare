package com.autocare.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.autocare.entity.FeedbackModel;

@Repository
public interface FeedbackRepo extends JpaRepository<FeedbackModel, Integer> {
}
