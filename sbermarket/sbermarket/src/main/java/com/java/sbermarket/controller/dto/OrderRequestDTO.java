package com.java.sbermarket.controller.dto;

import java.util.List;
import java.util.stream.Collectors;

import com.java.sbermarket.entity.Order;
import com.java.sbermarket.entity.OrderItem;

public class OrderRequestDTO {

    private List<OrderItemRequestDTO> orderItems;

    public List<OrderItemRequestDTO> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItemRequestDTO> orderItems) {
        this.orderItems = orderItems;
    }

    public Order toEntity() {
        Order order = new Order();
        List<OrderItem> orderItemEntities = this.orderItems.stream()
                .map(orderItemRequestDTO -> orderItemRequestDTO.toEntity(order))
                .collect(Collectors.toList());
        order.setOrderItems(orderItemEntities);
        return order;
    }

}
