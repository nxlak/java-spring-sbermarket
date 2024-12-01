package com.java.sbermarket.controller.dto;

import com.java.sbermarket.entity.CartItem;

public class CartItemResponseDTO {

    private Long cartItemId;

    private ProductResponseDTO product;

    private Integer amount;

    public CartItemResponseDTO(Long cartItemId, ProductResponseDTO product, Integer amount) {
        this.cartItemId = cartItemId;
        this.product = product;
        this.amount = amount;
    }

    public CartItemResponseDTO(CartItem cartItem) {
        this.cartItemId = cartItem.getCartItemId();
        this.product = new ProductResponseDTO(cartItem.getProduct());
        this.amount = cartItem.getAmount(); 
    }

    public Long getCartItemId() {
        return cartItemId;
    }

    public void setCartItemId(Long cartItemId) {
        this.cartItemId = cartItemId;
    }

    public ProductResponseDTO getProduct() {
        return product;
    }

    public void setProduct(ProductResponseDTO product) {
        this.product = product;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    
}
