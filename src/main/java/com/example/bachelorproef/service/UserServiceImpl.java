package com.example.bachelorproef.service;

import com.example.bachelorproef.model.User;
import com.example.bachelorproef.repository.UserRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

//generate a service class that implements the UserService interface
@Service
public class UserServiceImpl implements UserService {
    //generate a private field for the user repository
    @Autowired
    private UserRepository userRepository;

    //generate a public method to save a user to the database
    public User saveUser(User user) {
        userRepository.save(user);
        return user;
    }
    @Override
    public User findById(Long id) {

        return userRepository.findById(id).orElse(null); //achteraf gegenereerd
    }
    //generate a public method to get all users
    public List<User> getAllUsers() {
        List<User> users = userRepository.findAll();
        return users;
    }
    @Override
    public User findByEmail(String email) {
        //aangepast na input validatie en searchbar in frontend
        return userRepository.findByEmail(email);
    }
    @Override
    public User findByEmailAndPassword(String email, String password) {
        return null;
    }
    @Override
    public User findByName(String name) {
        return null;
    }
    @Override
    public User findByNameAndPassword(String name, String password) {
        return null;
    }
    @Override
    public void deleteById(Long id) {

    }

    //generate a public method to get a user by id
    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }
    //generate a public method to get a user by email
    public User getUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }
    //generate a public method to get a user by email and password
    public User getUserByEmailAndPassword(String email, String password) {
        return userRepository.findByEmailAndPassword(email, password);
    }
    //generate a public method to get a user by name
    public User getUserByName(String name) {
        return userRepository.findByName(name);
    }
    //generate a public method to get a user by name and password
    public User getUserByNameAndPassword(String name, String password) {
        return userRepository.findByNameAndPassword(name, password);
    }
    //generate a public method to add a user
    public User addUser(User user) {
        return userRepository.save(user);
    }
    //generate a public method to update a user
    public User updateUser(User user) {
        return userRepository.save(user);
    }

}
