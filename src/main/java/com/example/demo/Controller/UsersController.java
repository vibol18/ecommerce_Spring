package com.example.demo.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Users;
import com.example.demo.Service.AuthService;
import com.example.demo.Service.UserService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import lombok.RequiredArgsConstructor;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UsersController {

    private final AuthService authService;
    private final UserService userService;

    @GetMapping("/allUser")
    public List<Users> getAllUsers() {

        return authService.getAllUsers();
    }

    // get by id
    @GetMapping("/{id}")
    public Users getById(@PathVariable Long id) {
        return userService.getById(id);
    }

    // user update
    @PatchMapping("/update/{id}")
    public Users updateUser(
            @PathVariable Long id,
            @RequestBody Users updateUsers) {

        return userService.updateUser(id, updateUsers);
    }
}