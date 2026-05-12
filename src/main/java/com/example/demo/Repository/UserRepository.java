package com.example.demo.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Users;

public interface UserRepository
        extends JpaRepository<Users, Long> {

    Optional<Users> findByEmail(String email);
}