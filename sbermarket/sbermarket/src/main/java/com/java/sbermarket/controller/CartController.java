package com.java.sbermarket.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.java.sbermarket.controller.dto.AmountDTO;
import com.java.sbermarket.controller.dto.CartResponseDTO;
import com.java.sbermarket.service.CartService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class CartController {
    
    private final CartService cartService;
    
    @Autowired
    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @GetMapping("/cart/{cartId}")
    public CartResponseDTO findById(@PathVariable Long cartId) {
        return new CartResponseDTO(cartService.getById(cartId));
    }
    
    
    @PostMapping("/cart/{cartId}/product/{productId}")
    public CartResponseDTO addProductToCart(@PathVariable Long cartId, @PathVariable Long productId, @RequestBody AmountDTO amountDTO) {
        return new CartResponseDTO(cartService.addProduct(cartId, productId, amountDTO.getAmount()));
    }

    @DeleteMapping("/cart/{cartId}/product/{productId}")
    public CartResponseDTO removeProductFromCart(@PathVariable Long cartId, @PathVariable Long productId) {
        return new CartResponseDTO(cartService.removeProduct(cartId, productId));
    }
    
}
