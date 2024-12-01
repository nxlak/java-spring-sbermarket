package com.java.sbermarket.controller.dto;

import com.java.sbermarket.entity.CartItem;

public class CartItemRequestDTO {
    
    //private Long cartItemId;

    private ProductRequestDTO product;

    private Integer amount;

    /*
    public Long getCartItemId() {
        return cartItemId;
    }

    public void setCartItemId(Long cartItemId) {
        this.cartItemId = cartItemId;
    }
    */

    public ProductRequestDTO getProduct() {
        return product;
    }

    public void setProduct(ProductRequestDTO product) {
        this.product = product;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public CartItem toEntity() {
        CartItem cartItem = new CartItem();
        //cartItem.setCartItemId(this.getCartItemId());
        cartItem.setProduct(this.getProduct().toEntity());
        cartItem.setAmount(this.getAmount());
        return cartItem;
    }

}
