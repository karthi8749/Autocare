package com.autocare.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.autocare.entity.ContactModel;

@Repository
public interface ContactRepo extends JpaRepository<ContactModel, Integer> {
}
