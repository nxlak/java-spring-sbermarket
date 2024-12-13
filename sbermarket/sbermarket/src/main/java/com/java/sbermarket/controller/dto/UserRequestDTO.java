package com.java.sbermarket.controller.dto;

import java.util.List;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class UserRequestDTO {

    private String login;
    private String password;
    private String mail;
    private String phone;
    private String address;

    private List<PayMethodRequestDTO> pay_methods;

    private CartRequestDTO cart;

    private FavouritesRequestDTO favourites;

    private List<OrderRequestDTO> orders;

}
