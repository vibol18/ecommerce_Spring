package com.example.demo.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Users;
import com.example.demo.Service.AuthService;

import lombok.RequiredArgsConstructor;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UsersController {

    private final AuthService authService;

    @GetMapping("/allUser")
    public List<Users> getAllUsers() {

        return authService.getAllUsers();
    }

    // get by id
    @GetMapping("/{id}")
    public Users getById(@PathVariable Long id) {
        return authService.getById(id);
    }
}