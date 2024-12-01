package com.java.sbermarket.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.java.sbermarket.controller.dto.FavouritesResponseDTO;
import com.java.sbermarket.service.FavouritesService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
public class FavouritesController {
    
    private final FavouritesService favouritesService;
    
    @Autowired
    public FavouritesController(FavouritesService favouritesService) {
        this.favouritesService = favouritesService;
    }

    @GetMapping("/favourites/{id}")
    public FavouritesResponseDTO findById(@PathVariable Long id) {
        return new FavouritesResponseDTO(favouritesService.getById(id));
    }
    
    @PostMapping("/favourites/{id}/product/{productId}")
    public FavouritesResponseDTO addProduct(@PathVariable Long id, @PathVariable Long productId) {
        return new FavouritesResponseDTO(favouritesService.addProduct(id, productId));
    }

    @DeleteMapping("/favourites/{id}/product/{productId}")
    public FavouritesResponseDTO removeProduct(@PathVariable Long id, @PathVariable Long productId) {
        return new FavouritesResponseDTO(favouritesService.removeProduct(id, productId));
    }

}
