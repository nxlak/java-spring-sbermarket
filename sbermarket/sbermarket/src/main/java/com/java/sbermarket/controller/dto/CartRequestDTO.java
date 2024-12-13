package com.java.sbermarket.controller.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.java.sbermarket.entity.Cart;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CartRequestDTO {

    private List<CartItemRequestDTO> cartItems;

    public List<CartItemRequestDTO> getCartItems() {
        return cartItems;
    }
    
    public Cart toEntity() {
        Cart cart = new Cart();

        if (this.getCartItems() != null && !this.getCartItems().isEmpty()) {
            cart.setCartItems(this.getCartItems().stream()
                .map(CartItemRequestDTO::toEntity)
                .collect(Collectors.toList()));
        } else {
            cart.setCartItems(new ArrayList<>());
        }

        return cart;
    }
}
