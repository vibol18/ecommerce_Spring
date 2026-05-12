package com.example.demo.Dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductsResponceDTO {
    private Long id;
    private String name;
    private String description;
    private String imageUrl;
    private double price;
    private int stock;
}
