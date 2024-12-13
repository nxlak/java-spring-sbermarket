package com.java.sbermarket.controller.dto;

import java.math.BigDecimal;

import com.java.sbermarket.entity.Product;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ProductResponseDTO {
    
    private Long productId;

    private String name;
    
    private String photo_source;
    
    private BigDecimal weight;
    
    private BigDecimal price;

    public ProductResponseDTO(Product product) {
        this.productId = product.getProductId();
        this.name = product.getName();
        this.photo_source = product.getPhoto_source();
        this.weight = product.getWeight();
        this.price = product.getPrice();
    }

}
