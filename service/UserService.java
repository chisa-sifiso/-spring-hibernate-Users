package com.example.spring_hibernate.service;

import com.example.spring_hibernate.model.User;
import com.example.spring_hibernate.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public List<User> getUserRepository() {
        return userRepository.findAll();
    }


    public User saveUser(User user) {
        return userRepository.save(user);
    }

    // Fetch a user by ID
    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    // Delete a user by ID
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
