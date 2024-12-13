package com.java.sbermarket.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.sbermarket.entity.Favourites;
import com.java.sbermarket.entity.Product;
import com.java.sbermarket.repository.FavouritesRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class FavouritesService {
    
    private final FavouritesRepository favouritesRepository;
    private final ProductService productService;

    @Autowired
    public FavouritesService(FavouritesRepository favouritesRepository, ProductService productService) {
        this.favouritesRepository = favouritesRepository;
        this.productService = productService;
    }

    public Favourites getById(Long id) {
        return favouritesRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("can't find favourites"));
    }

    public Favourites addProduct(Long id, Long productId) {
        Favourites favourites = getById(id);
        Product product = productService.getById(productId);

        Product existingProduct = favourites.getProducts().stream().filter(item -> item.getProductId().equals(productId)).findFirst().orElse(null);
        
        if (existingProduct == null) {
            favourites.getProducts().add(product);
        }

        favouritesRepository.save(favourites);
        return favourites; 
    }

    public Favourites removeProduct(Long id, Long productId) {
        Favourites favourites = getById(id);
        Product productToRemove = favourites.getProducts().stream().filter(item -> item.getProductId().equals(productId)).findFirst().orElseThrow(() -> new EntityNotFoundException());
        favourites.getProducts().remove(productToRemove);
        favouritesRepository.save(favourites);

        return favourites;
    }
    
}
