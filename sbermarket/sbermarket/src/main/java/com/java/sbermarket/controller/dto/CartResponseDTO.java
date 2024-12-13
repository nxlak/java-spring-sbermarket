package com.java.sbermarket.controller.dto;

import java.util.List;
import java.util.stream.Collectors;

import com.java.sbermarket.entity.Cart;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CartResponseDTO {

    private Long cartId;

    private List<CartItemResponseDTO> cartItems;

    public CartResponseDTO(Cart cart) {
        this.cartId = cart.getCartId();
        this.cartItems = cart.getCartItems().stream()
                .map(CartItemResponseDTO::new)
                .collect(Collectors.toList());
    }
    
}
