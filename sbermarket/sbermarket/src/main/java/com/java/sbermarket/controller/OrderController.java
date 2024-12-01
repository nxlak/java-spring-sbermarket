package com.java.sbermarket.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.java.sbermarket.controller.dto.OrderRequestDTO;
import com.java.sbermarket.controller.dto.OrderResponseDTO;
import com.java.sbermarket.entity.Order;
import com.java.sbermarket.service.OrderService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class OrderController {
    
    private final OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping("/users/{userId}/orders")
    public OrderResponseDTO addOrder(@PathVariable Long userId, @RequestBody OrderRequestDTO orderRequestDTO) {
        Order savedOrder = orderService.addOrder(userId, orderRequestDTO);
        return new OrderResponseDTO(savedOrder);
    }


    @GetMapping("/orders/{orderId}")
    public OrderResponseDTO findById(@PathVariable Long orderId) {
        return new OrderResponseDTO(orderService.getById(orderId));
    }
    
    
}
