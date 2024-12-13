package com.java.sbermarket.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.sbermarket.entity.Cart;
import com.java.sbermarket.entity.Favourites;
import com.java.sbermarket.entity.Order;
import com.java.sbermarket.entity.PayMethod;
import com.java.sbermarket.entity.User;
import com.java.sbermarket.exceptions.UserNotFoundException;
import com.java.sbermarket.repository.UserRepository;

@Service
public class UserService {
    
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Long save(String login, String password, String mail, String phone, String address, List<PayMethod> pay_methods, Cart cart, Favourites favourites, List<Order> orders) {
        User user = User.builder().login(login).password(password).mail(mail).phone(phone).address(address).
                                    pay_methods(pay_methods).cart(cart).favourites(favourites).orders(orders).build();
        return userRepository.save(user).getUserId();
    }

    public User getById(Long userId) {
        return userRepository.findById(userId).orElseThrow(() -> new UserNotFoundException("can't find user with id="+userId));
    }

}
