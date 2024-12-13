package com.java.sbermarket.controller.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.java.sbermarket.entity.Favourites;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class FavouritesRequestDTO {
    
    private Long id;

    private List<ProductRequestDTO> products;
    
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
