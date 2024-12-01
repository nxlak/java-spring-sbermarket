package com.java.sbermarket.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.java.sbermarket.controller.dto.UserRequestDTO;
import com.java.sbermarket.controller.dto.UserResponseDTO;
import com.java.sbermarket.entity.Cart;
import com.java.sbermarket.entity.Order;
import com.java.sbermarket.entity.Favourites;
import com.java.sbermarket.entity.PayMethod;
import com.java.sbermarket.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class UserController {
    
    private final UserService userService;
    
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users/{userId}")
    public UserResponseDTO getById(@PathVariable Long userId) {
        return new UserResponseDTO(userService.getById(userId));
    }
    
    @PostMapping("/users")
    public Long save(@RequestBody UserRequestDTO userRequestDTO) {

        List<PayMethod> payMethods = userRequestDTO.getPay_methods().stream()
            .map(payMethodRequestDTO -> payMethodRequestDTO.toEntity())
            .collect(Collectors.toList());

        Cart cart = userRequestDTO.getCart().toEntity();

        Favourites favourites = userRequestDTO.getFavourites().toEntity();

        List<Order> orders = userRequestDTO.getOrders().stream()
            .map(orderRequestDTO -> orderRequestDTO.toEntity())
            .collect(Collectors.toList());

        return userService.save(
            userRequestDTO.getLogin(),
            userRequestDTO.getPassword(),
            userRequestDTO.getMail(),
            userRequestDTO.getPhone(),
            userRequestDTO.getAddress(),
            payMethods,
            cart,
            favourites,
            orders
        );
    }
    
}
