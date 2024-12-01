package com.java.sbermarket.controller.dto;

import java.util.List;

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

    public List<PayMethodRequestDTO> getPay_methods() {
        return pay_methods;
    }

    public void setPay_methods(List<PayMethodRequestDTO> pay_methods) {
        this.pay_methods = pay_methods;
    }

    public CartRequestDTO getCart() {
        return cart;
    }

    public void setCart(CartRequestDTO cart) {
        this.cart = cart;
    }

    public FavouritesRequestDTO getFavourites() {
        return favourites;
    }

    public void setFavourites(FavouritesRequestDTO favourites) {
        this.favourites = favourites;
    }

    public List<OrderRequestDTO> getOrders() {
        return orders;
    }

    public void setOrders(List<OrderRequestDTO> orders) {
        this.orders = orders;
    }


    
}
