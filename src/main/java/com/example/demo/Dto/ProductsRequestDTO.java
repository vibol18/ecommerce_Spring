package com.example.demo.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductsRequestDTO {
    private String name;
    private String description;

    private String imageUrl;
    private double price;
    private int stock;
}
