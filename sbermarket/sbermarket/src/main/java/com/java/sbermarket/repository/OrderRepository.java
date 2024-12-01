package com.java.sbermarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.sbermarket.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
    
}
