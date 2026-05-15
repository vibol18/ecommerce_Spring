package com.example.demo.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Entity.Cart;
import com.example.demo.Repository.CartRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor

public class CartService {

    private final CartRepository cartRepository;

    // Get all cart items
    public List<Cart> getAllCartItems() {
        return cartRepository.findAll();
    }

    // Add to cart
    public Cart addToCart(Cart cart) {

        Cart newCart = new Cart();

        newCart.setProductName(cart.getProductName());
        newCart.setPrice(cart.getPrice());
        newCart.setQuantity(cart.getQuantity());
        newCart.setImageUrl(cart.getImageUrl());

        return cartRepository.save(newCart);
    }

    // Update quantity
    public Cart updateCart(Long id, Cart cart) {

        Cart oldCart = cartRepository.findById(id).orElse(null);

        if (oldCart != null) {

            oldCart.setProductName(cart.getProductName());
            oldCart.setPrice(cart.getPrice());
            oldCart.setQuantity(cart.getQuantity());
            oldCart.setImageUrl(cart.getImageUrl());

            return cartRepository.save(oldCart);
        }

        return null;
    }

    // Delete
    public String deleteCart(Long id) {

        cartRepository.deleteById(id);

        return "Cart item deleted";
    }
}