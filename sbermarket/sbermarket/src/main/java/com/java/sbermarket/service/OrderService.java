package com.java.sbermarket.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.sbermarket.controller.dto.OrderRequestDTO;
import com.java.sbermarket.entity.Order;
import com.java.sbermarket.entity.User;
import com.java.sbermarket.repository.OrderRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class OrderService {
    
    private final OrderRepository orderRepository;

    private final ProductService productService;
    
    private final UserService userService;

    @Autowired
    public OrderService(OrderRepository orderRepository, ProductService productService, UserService userService) {
        this.orderRepository = orderRepository;
        this.productService = productService;
        this.userService = userService;
    }

    public Order getById(Long orderId) {
        return orderRepository.findById(orderId).orElseThrow(() -> new EntityNotFoundException("can't find this order"));
    }

    public Order addOrder(Long userId, OrderRequestDTO orderRequestDTO) {
        User user = userService.getById(userId); 
        Order order = orderRequestDTO.toEntity();
        order.setUser(user); 
        return orderRepository.save(order);
    }
}
