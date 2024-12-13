package com.java.sbermarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.sbermarket.entity.Discount;

public interface DiscountRepository extends JpaRepository<Discount, Long> {
    
}
