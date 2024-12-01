package com.java.sbermarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.sbermarket.entity.Favourites;

public interface FavouritesRepository extends JpaRepository<Favourites, Long> {
    
}
