package com.java.sbermarket.controller.dto;

import java.math.BigDecimal;

import com.java.sbermarket.entity.Product;

public class ProductRequestDTO {
    
    private Long productId;

    private String name;
    
    private String photo_source;
    
    private BigDecimal weight;
    
    private BigDecimal price;
 
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

    public Product toEntity() {
        Product product = new Product();
        product.setProductId(this.getProductId());
        product.setName(this.getName());
        product.setPhoto_source(this.getPhoto_source());
        product.setWeight(this.getWeight());
        product.setPrice(this.getPrice());
        return product;
    }
    
}
