package com.java.sbermarket.entity;

import jakarta.persistence.*;

@Entity
public class OrderItem {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long orderItemId;

    private Long productId;

    private Integer amount;

    public OrderItem(Long productId, Integer amount) {
        this.productId = productId;
        this.amount = amount;
    }

    public OrderItem() {

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

    @Override
    public String toString() {
        return "OrderItem [orderItemId=" + orderItemId + ", productId=" + productId + ", amount=" + amount + "]";
    }

    
}
