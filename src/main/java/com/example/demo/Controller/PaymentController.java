package com.example.demo.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.example.demo.Dto.PaymentRequest;
import com.example.demo.Entity.Cart;
import com.example.demo.Entity.Payments;
import com.example.demo.Service.PaymentService;

import lombok.RequiredArgsConstructor;

@RequestMapping("/api/payments")
@CrossOrigin(origins = "http://localhost:5173")
@RestController
public class PaymentController {
    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    // create Paymen
}