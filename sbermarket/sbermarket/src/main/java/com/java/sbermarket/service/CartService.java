package com.java.sbermarket.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.sbermarket.entity.Cart;
import com.java.sbermarket.entity.CartItem;
import com.java.sbermarket.entity.Product;
import com.java.sbermarket.repository.CartRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class CartService {

    private final CartRepository cartRepository;
    private final ProductService productService;

    @Autowired
    public CartService(CartRepository cartRepository, ProductService productService) {
        this.cartRepository = cartRepository;
        this.productService = productService;
    }

    public Cart getById(Long cartId) {
        return cartRepository.findById(cartId).orElseThrow(() -> new EntityNotFoundException("Cart not found with id: " + cartId));
    }

    public Cart addProduct(Long cartId, Long productId, int quantity) {
        Cart cart = getById(cartId); 
        Product product = productService.getById(productId); 

        CartItem existingItem = cart.getCartItems().stream()
                                    .filter(item -> item.getProduct().equals(product))
                                    .findFirst()
                                    .orElse(null);

        if (existingItem != null) {
            existingItem.setAmount(existingItem.getAmount() + quantity);
        } else {
            CartItem newItem = new CartItem(product, quantity);
            cart.getCartItems().add(newItem);
        }

        cartRepository.save(cart);
        return cart; 
    }

    public Cart removeProduct(Long cartId, Long productId) {
        Cart cart = getById(cartId);
        Product product = productService.getById(productId); 
    
        CartItem itemToRemove = cart.getCartItems().stream()
                                     .filter(item -> item.getProduct().equals(product))
                                     .findFirst()
                                     .orElseThrow(() -> new EntityNotFoundException("Product not found in the cart"));
    
        cart.getCartItems().remove(itemToRemove);
    
        cartRepository.save(cart);
        return cart;
    }
}
