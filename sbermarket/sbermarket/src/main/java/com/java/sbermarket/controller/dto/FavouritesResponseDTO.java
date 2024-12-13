package com.java.sbermarket.controller.dto;

import java.util.List;
import java.util.stream.Collectors;

import com.java.sbermarket.entity.Favourites;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class FavouritesResponseDTO {
    
    private Long id;

    private List<ProductResponseDTO> products;

    public FavouritesResponseDTO(Favourites favourites) {
        this.id = favourites.getId();
        this.products = favourites.getProducts().stream().map(ProductResponseDTO::new).collect(Collectors.toList());
    }

}
