package com.example.demo.Controller;

import org.springframework.web.bind.annotation.*;

import com.example.demo.Dto.LoginRequestDTO;
import com.example.demo.Dto.RegisterRequestDTO;
import com.example.demo.Service.AuthService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins = "http://localhost:5173")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/register")
    public String register(@RequestBody RegisterRequestDTO request) {
        return authService.register(request);
    }

    @PostMapping("/login")
    public String login(@RequestBody LoginRequestDTO req) {
        return authService.login(req);
    }
}