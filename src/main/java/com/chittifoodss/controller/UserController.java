package com.chittifoodss.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.chittifoodss.model.User;
import com.chittifoodss.repository.UserRepository;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    // Register User
    @PostMapping("/register")
    public User registerUser(@RequestBody User user){
        return userRepository.save(user);
    }

    // Get all users
    @GetMapping
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    // Login User
    @PostMapping("/login")
    public String loginUser(@RequestBody User loginUser){

        Optional<User> user = userRepository.findAll()
                .stream()
                .filter(u -> u.getEmail().equals(loginUser.getEmail())
                && u.getPassword().equals(loginUser.getPassword()))
                .findFirst();

        if(user.isPresent()){
            return "Login Successful";
        }else{
            return "Invalid Email or Password";
        }
    }
}