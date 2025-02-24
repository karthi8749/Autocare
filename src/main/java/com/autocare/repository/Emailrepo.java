package com.autocare.repository;

import com.autocare.entity.Customers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Emailrepo extends JpaRepository<Customers, Integer> {

}
