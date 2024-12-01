package com.java.sbermarket.controller.dto;

import java.math.BigDecimal;

import com.java.sbermarket.entity.Product;

public class ProductResponseDTO {
    
    private Long productId;

    private String name;
    
    private String photo_source;
    
    private BigDecimal weight;
    
    private BigDecimal price;

    public ProductResponseDTO(Long productId, String name, String photo_source, BigDecimal weight, BigDecimal price) {
        this.productId = productId;
        this.name = name;
        this.photo_source = photo_source;
        this.weight = weight;
        this.price = price;
    }

    public ProductResponseDTO(Product product) {
        this.productId = product.getProductId();
        this.name = product.getName();
        this.photo_source = product.getPhoto_source();
        this.weight = product.getWeight();
        this.price = product.getPrice();
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoto_source() {
        return photo_source;
    }

    public void setPhoto_source(String photo_source) {
        this.photo_source = photo_source;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }


}
