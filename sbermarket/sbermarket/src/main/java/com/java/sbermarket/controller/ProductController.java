package com.java.sbermarket.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.java.sbermarket.controller.dto.ProductRequestDTO;
import com.java.sbermarket.controller.dto.ProductResponseDTO;
import com.java.sbermarket.service.ProductService;

@RestController
public class ProductController {

    private final ProductService productService;
    
    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    
    @GetMapping("/product/{productId}")
    public ProductResponseDTO findById(@PathVariable Long productId) {
        return new ProductResponseDTO(productService.getById(productId));
    }

    @PostMapping("/product")
    public Long save(@RequestBody ProductRequestDTO productRequestDTO) {
        return productService.save(productRequestDTO.getName(), productRequestDTO.getPhoto_source(), productRequestDTO.getWeight(), productRequestDTO.getPrice());
    }
}
