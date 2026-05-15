package com.example.demo.Service;

import com.example.demo.Repository.UserRepository;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Users;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class UserService {
    private final UserRepository userRepository;

    public Users getById(Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User Not Found"));
    }

    public Users updateUser(Long id, Users updateUsers) {

        Users u = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User Not Found"));

        if (updateUsers.getUsername() != null) {
            u.setUsername(updateUsers.getUsername());
        }

        if (updateUsers.getEmail() != null) {
            u.setEmail(updateUsers.getEmail());
        }

        if (updateUsers.getPassword() != null) {
            u.setPassword(updateUsers.getPassword());
        }

        if (updateUsers.getPhone() != null) {
            u.setPhone(updateUsers.getPhone());
        }

        if (updateUsers.getRole() != null) {
            u.setRole(updateUsers.getRole());
        }

        return userRepository.save(u);
    }
}
