package com.java.sbermarket.controller.dto;

import java.math.BigDecimal;

import com.java.sbermarket.entity.Product;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ProductRequestDTO {
    
    private Long productId;

    private String name;
    
    private String photo_source;
    
    private BigDecimal weight;
    
    private BigDecimal price;
 
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
