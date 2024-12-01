package com.java.sbermarket.controller.dto;

import java.util.List;
import java.util.stream.Collectors;

import com.java.sbermarket.entity.Favourites;

public class FavouritesResponseDTO {
    
    private Long id;

    private List<ProductResponseDTO> products;

    public FavouritesResponseDTO(Long id, List<ProductResponseDTO> product) {
        this.id = id;
        this.products = product;
    }

    public FavouritesResponseDTO(Favourites favourites) {
        this.id = favourites.getId();
        this.products = favourites.getProducts().stream().map(ProductResponseDTO::new).collect(Collectors.toList());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<ProductResponseDTO> getProducts() {
        return products;
    }

    public void setProducts(List<ProductResponseDTO> products) {
        this.products = products;
    }

    
}
