package com.java.sbermarket.entity;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;

    private String login;
    private String password;
    private String mail;
    private String phone;
    private String address;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<PayMethod> pay_methods;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Cart cart;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Favourites favourites;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Order> orders;

    public User(String login, String password, String mail, String phone, String address, List<PayMethod> pay_methods,
            Cart cart, Favourites favourites, List<Order> orders) {
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

    public User() {

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

    public List<PayMethod> getPay_methods() {
        return pay_methods;
    }

    public void setPay_methods(List<PayMethod> pay_methods) {
        this.pay_methods = pay_methods;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public Favourites getFavourites() {
        return favourites;
    }

    public void setFavourites(Favourites favourites) {
        this.favourites = favourites;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "User [userId=" + userId + ", login=" + login + ", password=" + password + ", mail=" + mail + ", phone="
                + phone + ", address=" + address + ", pay_methods=" + pay_methods + ", cart=" + cart + ", favourites="
                + favourites + ", orders=" + orders + "]";
    }

}
