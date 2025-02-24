package com.autocare.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.autocare.dto.UserDTO;
import com.autocare.entity.UserModel;

import jakarta.transaction.Transactional;

@Repository
public interface UserRepo extends JpaRepository<UserModel, Long> {
    // http://localhost:8080/api/userModels/search/findByEmail?email=doco@mailinator.com
    Optional<UserModel> findByEmail(String email); // - Find user by email (which will be unique)

    // http://localhost:8080/api/userModels/search/findByRole?role=admin
    List<UserModel> findByRole(String role); // Return a list of users with the specified role

    @Query("SELECT new com.autocare.dto.UserDTO(u.id, u.username, u.email, u.mobile, u.address, u.role, u.password) " +
            "FROM UserModel u WHERE u.email = :email")
    Optional<UserDTO> findUserDetailsWithoutImage(@Param("email") String email);

    @Transactional
    @Modifying
    @Query("UPDATE UserModel u SET u.password = :password WHERE u.email = :email")
    int updatePasswordByEmail(@Param("email") String email, @Param("password") String password);

}
