package com.java.sbermarket.controller.dto;

import com.java.sbermarket.entity.Order;
import com.java.sbermarket.entity.OrderItem;

public class OrderItemRequestDTO {
    
    private Long productId;
    private Integer amount;

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

    public OrderItem toEntity(Order order) {
        OrderItem orderItem = new OrderItem();
        orderItem.setProductId(this.productId);
        orderItem.setAmount(this.amount);
        return orderItem;
    }
}