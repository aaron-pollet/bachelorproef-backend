package com.example.bachelorproef.service;

import com.example.bachelorproef.model.User;
import com.example.bachelorproef.repository.UserRepository;
import com.example.bachelorproef.util.PasswordHashingUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

//generate a service class that implements the UserService interface
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    //rewrite the save method to hash the user's password before saving it in the database using a password hashing utility class
    public User saveUser(User user) {
        //hash the user's password before saving it in the database
        user.setPassword(PasswordHashingUtil.hashPassword(user.getPassword()));
        userRepository.saveAndFlush(user);
        return user;
    }
    @Override
    public User findById(Long id) {

        return userRepository.findById(id).orElse(null); //achteraf gegenereerd
    }
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
    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }
    public User getUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }
    public User getUserByEmailAndPassword(String email, String password) {
        return userRepository.findByEmailAndPassword(email, password);
    }
    public User getUserByName(String name) {
        return userRepository.findByName(name);
    }
    public User getUserByNameAndPassword(String name, String password) {
        return userRepository.findByNameAndPassword(name, password);
    }
    public User addUser(User user) {
        return userRepository.save(user);
    }
    public User updateUser(User user) {
        return userRepository.save(user);
    }

}
