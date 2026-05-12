package com.example.demo.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.example.demo.Dto.ProductsRequestDTO;
import com.example.demo.Entity.Products;
import com.example.demo.Service.ProductService;

import lombok.RequiredArgsConstructor;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping
    public Products create(@RequestBody ProductsRequestDTO request) {
        return productService.createProducts(request);
    }

    @GetMapping
    public List<Products> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/{id}")
    public Products getById(@PathVariable Long id) {
        return productService.getById(id);
    }
}