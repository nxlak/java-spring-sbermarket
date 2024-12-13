package com.java.sbermarket.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.sbermarket.entity.Discount;
import com.java.sbermarket.repository.DiscountRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class DiscountService {
    
    private final DiscountRepository discountRepository;

    @Autowired
    public DiscountService(DiscountRepository discountRepository) {
        this.discountRepository = discountRepository;
    }

    public Discount getById(Long discountId) {
        return discountRepository.findById(discountId).orElseThrow(() -> new EntityNotFoundException("can't find discount with id = " + discountId));
    }

    public Discount addDiscount(Integer procent, LocalDate expirationDate) {
        Discount discount = new Discount();
        discount.setProcent(procent);
        discount.setExpirationDate(expirationDate);
        return discountRepository.save(discount);
    }

    public void removeDiscount(Long discountId) {
        discountRepository.delete(discountRepository.findById(discountId).orElseThrow(() -> new EntityNotFoundException()));
    }
}
