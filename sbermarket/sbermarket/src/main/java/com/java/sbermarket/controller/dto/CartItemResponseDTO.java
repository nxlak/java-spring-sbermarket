package com.java.sbermarket.controller.dto;

import com.java.sbermarket.entity.CartItem;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CartItemResponseDTO {

    private Long cartItemId;

    private ProductResponseDTO product;

    private Integer amount;

    public CartItemResponseDTO(CartItem cartItem) {
        this.cartItemId = cartItem.getCartItemId();
        this.product = new ProductResponseDTO(cartItem.getProduct());
        this.amount = cartItem.getAmount(); 
    }

}
