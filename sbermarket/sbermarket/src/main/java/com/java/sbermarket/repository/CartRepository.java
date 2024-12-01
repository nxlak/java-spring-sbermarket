package com.java.sbermarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.sbermarket.entity.Cart;

public interface CartRepository extends JpaRepository<Cart, Long> {
}
