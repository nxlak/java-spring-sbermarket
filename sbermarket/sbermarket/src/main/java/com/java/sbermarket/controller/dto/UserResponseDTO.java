package com.java.sbermarket.controller.dto;

import java.util.List;
import java.util.stream.Collectors;

import com.java.sbermarket.entity.User;

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

    public UserResponseDTO(Long userId, String login, String password, String mail, String phone, String address,
            List<PayMethodeResponseDTO> pay_methods, CartResponseDTO cart, FavouritesResponseDTO favourites, List<OrderResponseDTO> orders) {
        this.userId = userId;
        this.login = login;
        this.password = password;
        this.mail = mail;
        this.phone = phone;
        this.address = address;
        this.pay_methods = pay_methods;
        this.cart = cart;
        this.favourites = favourites;
        this.orders = orders;
    }

    public UserResponseDTO(User user) {
        this.userId = user.getUserId();
        this.login = user.getLogin();
        this.password = user.getPassword();
        this.mail = user.getMail();
        this.phone = user.getPhone();
        this.address = user.getAddress();
        this.pay_methods = user.getPay_methods().stream()
                                .map(PayMethodeResponseDTO::new).collect(Collectors.toList());
        this.cart = new CartResponseDTO(user.getCart());
        this.favourites = new FavouritesResponseDTO(user.getFavourites());
        if (user.getOrders() != null) {
            this.orders = user.getOrders().stream()
                .map(OrderResponseDTO::new)
                .collect(Collectors.toList());
        }
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<PayMethodeResponseDTO> getPay_methods() {
        return pay_methods;
    }

    public void setPay_methods(List<PayMethodeResponseDTO> pay_methods) {
        this.pay_methods = pay_methods;
    }

    public CartResponseDTO getCart() {
        return cart;
    }

    public void setCart(CartResponseDTO cart) {
        this.cart = cart;
    }

    public FavouritesResponseDTO getFavourites() {
        return favourites;
    }

    public void setFavourites(FavouritesResponseDTO favourites) {
        this.favourites = favourites;
    }

    public List<OrderResponseDTO> getOrders() {
        return orders;
    }

    public void setOrders(List<OrderResponseDTO> orders) {
        this.orders = orders;
    }

}
