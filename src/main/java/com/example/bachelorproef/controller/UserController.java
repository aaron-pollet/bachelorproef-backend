package com.example.bachelorproef.controller;

import com.example.bachelorproef.model.User;
import com.example.bachelorproef.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//generate a user controller class using the UserService class that uses REST do CRUD operations over API
@RestController
@RequestMapping("/api")
public class UserController {
    //generate a private field for the user service
    @Autowired
    private UserService userService;

    //generate a public method to save a user to the database
    @PostMapping("/add")
    public User saveUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    //generate a public method to get all users
    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    //generate a public method to get a user by id
    @GetMapping("/users/{id}")
    public User getUserById(@PathVariable Long id) {
        return userService.findById(id); //verandert van getUserById naar findById
    }

    //generate a public method to get a user by email
    @GetMapping("/users/email/{email}")
    public User getUserByEmail(@PathVariable String email) {
        return userService.findByEmail(email); //aangepast getUserByEmail -> findByEmail
    }

    //generate a public method to get a user by email and password
    @GetMapping("/users/email/{email}/password/{password}")
    public User getUserByEmailAndPassword(@PathVariable String email, @PathVariable String password) {
        return userService.findByEmailAndPassword(email, password); // aangepast getUserByEmailAndPassword -> findByEmailAndPassword
    }

    //generate a public method to get a user by name
    @GetMapping("/users/name/{name}")
    public User getUserByName(@PathVariable String name) {
        return userService.findByName(name); //aangepast getUserByName -> findByName
    }

    //generate a public method to get a user by name and password
    @GetMapping("/users/name/{name}/password/{password}")
    public User getUserByNameAndPassword(@PathVariable String name, @PathVariable String password) {
        return userService.findByNameAndPassword(name, password); //aangepast getUserByNameAndPassword -> findByNameAndPassword
    }

    //generate a public method to delete a user by id
    @DeleteMapping("/users/{id}")
    public void deleteUserById(@PathVariable Long id) {
        userService.deleteById(id); // aangepast deleteUserById -> deleteById
    }


    //TODO verwijderen dient als voorbeeld
    //generate method based on these service methods: "
//    @GetMapping("/sqlinjection")
//    public List<User> getUserTheWrondWay(String name){
//        return userService.findAllByNameWrong(name);
//    }
//
//    @PostMapping("/native")
//    public List<User> getUserTheNativeWay(String name){
//        return (List<User>) userService.findAllByNameNative(name);
//    }
//
//    @GetMapping("/sqlinjection")
//    public User getUserBySqlInjection(String name){
//        return userService.findBySqlInjection(name);
//    }
}