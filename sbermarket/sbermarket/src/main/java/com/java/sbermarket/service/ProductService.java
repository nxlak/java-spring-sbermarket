package com.java.sbermarket.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.sbermarket.entity.Product;
import com.java.sbermarket.repository.ProductRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }    

    public Product getById(Long productId) {
        return productRepository.findById(productId).orElseThrow(() -> new EntityNotFoundException("Product not found with id: " + productId));
    }

    public Long save(String name, String photo_source, BigDecimal weight, BigDecimal price) {
        Product product = new Product(name, photo_source, weight, price);
        return productRepository.save(product).getProductId();
    }
}
