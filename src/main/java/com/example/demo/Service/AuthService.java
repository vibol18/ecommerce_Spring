package com.example.demo.Service;

import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.Dto.LoginRequestDTO;
import com.example.demo.Dto.LoginresponceDTO;
import com.example.demo.Dto.RegisterRequestDTO;
import com.example.demo.Entity.Users;
import com.example.demo.Repository.UserRepository;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public String register(RegisterRequestDTO request) {

        if (userRepository.findByEmail(request.getEmail()).isPresent()) {
            return "Email already exists";
        }

        Users user = new Users();
        user.setUsername(request.getUsername());
        user.setEmail(request.getEmail());
        user.setPassword(passwordEncoder.encode(request.getPassword()));
        user.setPhone(request.getPhone());
        user.setRole("USER");

        userRepository.save(user);

        return "Register Success";
    }

    public String login(LoginRequestDTO req) {
        Users u = userRepository.findByEmail(req.getEmail())
                .orElseThrow(() -> new RuntimeException("email Not Found"));
        boolean isPasswordCorrect = passwordEncoder.matches(req.getPassword(), u.getPassword());
        if (!isPasswordCorrect) {
            throw new RuntimeException("Wrong Password");
        }
        return "Login Success";
    }

    public List<Users> getAllUsers() {
        return userRepository.findAll();
    }

    // Get user by ID
    public Users getById(Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User Not Found"));
    }
}