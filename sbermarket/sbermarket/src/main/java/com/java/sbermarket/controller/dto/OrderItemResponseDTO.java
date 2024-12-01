package com.java.sbermarket.controller.dto;

import com.java.sbermarket.entity.OrderItem;

public class OrderItemResponseDTO {
    
    private Long orderItemId;
    private Long productId;
    private Integer amount;

    public OrderItemResponseDTO(OrderItem orderItem) {
        this.orderItemId = orderItem.getOrderItemId();
        this.productId = orderItem.getProductId();
        this.amount = orderItem.getAmount();
    }

    public OrderItemResponseDTO(Long orderItemId, Long productId, Integer amount) {
        this.orderItemId = orderItemId;
        this.productId = productId;
        this.amount = amount;
    }

    public Long getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(Long orderItemId) {
        this.orderItemId = orderItemId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    
    
}
