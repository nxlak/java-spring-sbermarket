package com.java.sbermarket.controller.dto;

import java.util.List;
import java.util.stream.Collectors;

import com.java.sbermarket.entity.Order;

public class OrderResponseDTO {
    
    private Long orderId;

    private List<OrderItemResponseDTO> orderItems;

    public OrderResponseDTO(Long orderId, List<OrderItemResponseDTO> orderItems) {
        this.orderId = orderId;
        this.orderItems = orderItems;
    }

    public OrderResponseDTO(Order order) {
        this.orderId = order.getOrderId();
        this.orderItems = order.getOrderItems().stream()
                .map(OrderItemResponseDTO::new)
                .collect(Collectors.toList());
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public List<OrderItemResponseDTO> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItemResponseDTO> orderItems) {
        this.orderItems = orderItems;
    }


}
