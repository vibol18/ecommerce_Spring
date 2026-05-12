package com.example.demo.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Dto.ProductsRequestDTO;
import com.example.demo.Entity.Products;
import com.example.demo.Repository.ProductRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    // Create product
    public Products createProducts(ProductsRequestDTO request) {

        Products p = new Products();
        p.setName(request.getName());
        p.setPrice(request.getPrice());
        p.setDescription(request.getDescription());
        p.setImageUrl(request.getImageUrl());
        p.setStock(request.getStock());
        return productRepository.save(p);
    }

    // Get all products
    public List<Products> getAllProducts() {
        return productRepository.findAll();
    }

    // Get by ID
    public Products getById(Long id) {
        return productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Product Not Found"));
    }
}