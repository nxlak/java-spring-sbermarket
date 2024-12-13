package com.java.sbermarket.controller.dto;

import com.java.sbermarket.entity.Order;
import com.java.sbermarket.entity.OrderItem;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class OrderItemRequestDTO {
    
    private Long productId;
    private Integer amount;

    public OrderItem toEntity(Order order) {
        OrderItem orderItem = new OrderItem();
        orderItem.setProductId(this.productId);
        orderItem.setAmount(this.amount);
        return orderItem;
    }
}
