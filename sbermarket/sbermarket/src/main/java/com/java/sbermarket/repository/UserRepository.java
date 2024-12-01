package com.java.sbermarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.sbermarket.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
