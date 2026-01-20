package com.lpamplonadev.usermanagement.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lpamplonadev.usermanagement.model.User;

public interface UserRepository extends JpaRepository<User, UUID>{
  boolean existsByEmail(String email);  
}
