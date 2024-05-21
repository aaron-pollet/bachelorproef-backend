package com.example.bachelorproef.controller;

import com.example.bachelorproef.model.User;
import com.example.bachelorproef.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//generate a user controller class using the UserService class that uses REST do CRUD operations over API

@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/add")
    public User saveUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/users/{id}")
    public User getUserById(@PathVariable Long id) {
        return userService.findById(id);
    }

    @GetMapping("/users/email/{email}")
    public User getUserByEmail(@PathVariable String email) {
        return userService.findByEmail(email);
    }

    @GetMapping("/users/email/{email}/password/{password}")
    public User getUserByEmailAndPassword(@PathVariable String email, @PathVariable String password) {
        return userService.findByEmailAndPassword(email, password);
    }

    @GetMapping("/users/name/{name}")
    public User getUserByName(@PathVariable String name) {
        return userService.findByName(name);
    }

    @GetMapping("/users/name/{name}/password/{password}")
    public User getUserByNameAndPassword(@PathVariable String name, @PathVariable String password) {
        return userService.findByNameAndPassword(name, password);
    }

    @DeleteMapping("/users/{id}")
    public void deleteUserById(@PathVariable Long id) {
        userService.deleteById(id);
    }
}