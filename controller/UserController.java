package com.example.spring_hibernate.controller;

import com.example.spring_hibernate.model.User;
import com.example.spring_hibernate.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    // GET /api/users - Retrieve all users
    @GetMapping
    public List<User> getAllUsers() {
        return userService.getUserRepository();
    }

    // POST /api/users - Create a new user
    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    // GET /api/users/{id} - Retrieve a user by ID
    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    // DELETE /api/users/{id} - Delete a user by ID
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
    }
}
