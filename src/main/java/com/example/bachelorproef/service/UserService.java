package com.example.bachelorproef.service;

import com.example.bachelorproef.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

//generate UserService and a method to save a user to the database
@Service
public interface UserService {
    User saveUser(User user);
    List<User> getAllUsers();
    //generate the rest`
    User findById(Long id);
    User findByEmail(String email);
    User findByEmailAndPassword(String email, String password);
    User findByName(String name);
    User findByNameAndPassword(String name, String password);
    void deleteById(Long id);


}
