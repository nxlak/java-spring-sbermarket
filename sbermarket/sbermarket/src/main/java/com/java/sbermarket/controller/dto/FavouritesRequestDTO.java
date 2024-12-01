package com.java.sbermarket.controller.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.java.sbermarket.entity.Favourites;

public class FavouritesRequestDTO {
    
    private Long id;

    private List<ProductRequestDTO> products;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<ProductRequestDTO> getProducts() {
        return products;
    }

    public void setProducts(List<ProductRequestDTO> products) {
        this.products = products;
    }


    public Favourites toEntity() {
        Favourites favourites = new Favourites();
        favourites.setId(this.getId());

        if (this.getProducts() != null && !this.getProducts().isEmpty()) {
            favourites.setProducts(this.getProducts().stream()
                .map(ProductRequestDTO::toEntity)
                .collect(Collectors.toList()));
        } else {
            favourites.setProducts(new ArrayList<>());
        }

        return favourites;
    }

}
