package com.java.sbermarket.controller.dto;

import java.util.List;
import java.util.stream.Collectors;

import com.java.sbermarket.entity.User;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class UserResponseDTO {
    
    private Long userId;

    private String login;
    private String password;
    private String mail;
    private String phone;
    private String address;

    private List<PayMethodeResponseDTO> pay_methods;

    private CartResponseDTO cart;

    private FavouritesResponseDTO favourites;

    private List<OrderResponseDTO> orders;

    public UserResponseDTO(User user) {
        this.userId = user.getUserId();
        this.login = user.getLogin();
        this.password = user.getPassword();
        this.mail = user.getMail();
        this.phone = user.getPhone();
        this.address = user.getAddress();
        this.pay_methods = user.getPay_methods().stream()
                                .map(PayMethodeResponseDTO::new)
                                .collect(Collectors.toList());
        this.cart = new CartResponseDTO(user.getCart());
        this.favourites = new FavouritesResponseDTO(user.getFavourites());
        if (user.getOrders() != null) {
            this.orders = user.getOrders().stream()
                .map(OrderResponseDTO::new)
                .collect(Collectors.toList());
        }
    }

}
