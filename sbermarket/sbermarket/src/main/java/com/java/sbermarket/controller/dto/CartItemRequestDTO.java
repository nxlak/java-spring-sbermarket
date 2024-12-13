package com.java.sbermarket.controller.dto;

import com.java.sbermarket.entity.CartItem;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CartItemRequestDTO {

    private ProductRequestDTO product;

    private Integer amount;

    public CartItem toEntity() {
        CartItem cartItem = new CartItem();
        cartItem.setProduct(this.getProduct().toEntity());
        cartItem.setAmount(this.getAmount());
        return cartItem;
    }

}
