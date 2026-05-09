package com.example.demo.Controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    @GetMapping("/login")
    public String createProduct(@RequestParam String username, @RequestParam String password) {
        if (username.equals("admin") && password.equals("1234")) {
            return "login Successfully";
        } else {
            return "not Valid";
        }
    }

    @GetMapping("/allUser")
    public List<Map<String, Object>> getAlluser() {
        List<Map<String, Object>> name = new ArrayList<>();
        Map<String, Object> user1 = new HashMap<>();
        user1.put("gf", 14);
        user1.put(" max", 23);
        name.add(user1);
        return name;
    }

    @PostMapping("/Register")
    public String create_integer() {
        return "hello world";
    }

    @GetMapping("admin")
    public List<Map<String, Object>> getAllAdmin() {
        List<Map<String, Object>> admin = new ArrayList<>();
        Map<String, Object> admin1 = new HashMap<>();
        admin1.put("vibol", 12);
        admin1.put("coca", 17);
        admin1.put("qerqer", 34);
        admin.add(admin1);
        return admin;
    }
}
