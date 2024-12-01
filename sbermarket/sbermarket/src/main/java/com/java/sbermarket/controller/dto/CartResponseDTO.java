package com.java.sbermarket.controller.dto;

import java.util.List;
import java.util.stream.Collectors;

import com.java.sbermarket.entity.Cart;

public class CartResponseDTO {

    private Long cartId;

    private List<CartItemResponseDTO> cartItems;

    public CartResponseDTO(Long cartId, List<CartItemResponseDTO> cartItems) {
        this.cartId = cartId;
        this.cartItems = cartItems;
    }

    public CartResponseDTO(Cart cart) {
        this.cartId = cart.getCartId();
        this.cartItems = cart.getCartItems().stream()
                .map(CartItemResponseDTO::new)
                .collect(Collectors.toList());
    }

    public Long getCartId() {
        return cartId;
    }

    public void setCartId(Long cartId) {
        this.cartId = cartId;
    }

    public List<CartItemResponseDTO> getCartItems() {
        return cartItems;
    }

    public void setCartItems(List<CartItemResponseDTO> cartItems) {
        this.cartItems = cartItems;
    }
    
}
