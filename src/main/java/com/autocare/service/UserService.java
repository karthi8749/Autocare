package com.autocare.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.autocare.entity.UserModel;
import com.autocare.repository.UserRepo;

import jakarta.transaction.Transactional;

@Service
public class UserService {

	@Autowired
	private UserRepo repo;

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	public UserModel registerUser(UserModel user) {
		if (repo.findByEmail(user.getEmail()).isPresent()) {
			throw new IllegalArgumentException("Email is already in use");
		}
		// # Encoder
		// Encrypt the password before saving
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		return repo.save(user);
	}

	@Transactional
	public List<UserModel> findUsersByRole(String role) {
		return repo.findByRole(role);
	}

	public void updatePassword(String email, String newPassword) {
		newPassword = passwordEncoder.encode(newPassword);
		int updatedRows = repo.updatePasswordByEmail(email, newPassword);
		if (updatedRows == 0) {
			throw new RuntimeException("User not found with email: " + email);
		}
	}
}