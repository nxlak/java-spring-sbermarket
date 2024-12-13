package com.java.sbermarket.controller;

import org.springframework.web.bind.annotation.RestController;

import com.java.sbermarket.controller.dto.CartResponseDTO;
import com.java.sbermarket.controller.dto.DiscountRequestDTO;
import com.java.sbermarket.controller.dto.DiscountResponseDTO;
import com.java.sbermarket.service.DiscountService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class DiscountController {
    
    private final DiscountService discountService;

    public DiscountController(DiscountService discountService) {
        this.discountService = discountService;
    }

    @GetMapping("/discount/{discountId}")
    public DiscountResponseDTO findById(@PathVariable Long discountId) {
        return new DiscountResponseDTO(discountService.getById(discountId));
    }
    
    @PostMapping("/discount")
    public DiscountResponseDTO addDiscount(@RequestBody DiscountRequestDTO discountRequestDTO) {
        return new DiscountResponseDTO(discountService.addDiscount(discountRequestDTO.getProcent(), discountRequestDTO.getExpirationDate()));
    }
    
    @DeleteMapping("/discount/{discountId}")
    public void removeDiscount(@PathVariable Long discountId) {
        discountService.removeDiscount(discountId);
    }
}
