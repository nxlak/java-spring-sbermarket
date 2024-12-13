package com.java.sbermarket.controller.dto;

import java.util.List;
import java.util.stream.Collectors;

import com.java.sbermarket.entity.Order;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class OrderResponseDTO {
    
    private Long orderId;

    private List<OrderItemResponseDTO> orderItems;

    public OrderResponseDTO(Order order) {
        this.orderId = order.getOrderId();
        this.orderItems = order.getOrderItems().stream()
                .map(OrderItemResponseDTO::new)
                .collect(Collectors.toList());
    }

}
