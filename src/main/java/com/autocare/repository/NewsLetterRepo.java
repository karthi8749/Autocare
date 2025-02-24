package com.autocare.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.autocare.entity.NewsLetterModel;

@Repository
public interface NewsLetterRepo extends JpaRepository<NewsLetterModel, Integer> {
}
