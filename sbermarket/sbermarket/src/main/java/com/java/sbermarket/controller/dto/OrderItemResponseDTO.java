package com.java.sbermarket.controller.dto;

import com.java.sbermarket.entity.OrderItem;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class OrderItemResponseDTO {
    
    private Long orderItemId;
    private Long productId;
    private Integer amount;

    public OrderItemResponseDTO(OrderItem orderItem) {
        this.orderItemId = orderItem.getOrderItemId();
        this.productId = orderItem.getProductId();
        this.amount = orderItem.getAmount();
    }

}
