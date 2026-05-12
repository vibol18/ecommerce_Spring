package com.example.demo.Service;

import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.stringtemplate.v4.compiler.CodeGenerator.primary_return;

import com.example.demo.Dto.RegisterRequestDTO;
import com.example.demo.Entity.Users;
import com.example.demo.Repository.UserRepository;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public String register(RegisterRequestDTO request) {
        Users user = new Users();
        user.setEmail(request.getEmail());
        user.setPassword(passwordEncoder.encode(request.getPassword()));
        user.setUsername(request.getPhone());
        user.setRole("USER");
        userRepository.save(user);
        return "Register Success";
    }

    public List<Users> getAllUsers() {
        return userRepository.findAll();
    }
}