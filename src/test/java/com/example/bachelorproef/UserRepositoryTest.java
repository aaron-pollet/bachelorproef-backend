package com.example.bachelorproef;

//generate a UserRepositoryTest class that tests the queries in the UserRepository class
import com.example.bachelorproef.model.User;
import com.example.bachelorproef.repository.UserRepository;
import com.example.bachelorproef.service.UserService;
import com.example.bachelorproef.service.UserServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
public class UserRepositoryTest {
    //generate a private field for the user repository
    @Autowired
    private UserRepository userRepository;

    //achteraf toegevoegd want de db werd niet gecleaned voor het testen
    //generate a clean method to clean the repo before each test
    @Test
    @BeforeEach
    void clean() {
       userRepository.deleteAll();
    }
    //generate a test method to test the saveUser method
    @Test
    void testSaveUser() {
        //generate a new user object
        User user = new User("John", "", "");
        //save the user object to the database
        userRepository.save(user);
        //check if the user object is saved to the database
        User userFromDb = userRepository.findById(user.getId()).orElse(null);
        assertEquals(userFromDb, user);
    }

    //generate a test method to test the getAllUsers method
    @Test
    void testGetAllUsers() {
        //generate a new user object
        User user = new User("John", "john@email.com", "password");
        //save the user object to the database
        userRepository.save(user);
        //generate a new user object
        User user2 = new User("Bert", "bert@test.be", "password");
        //save the user object to the database
        userRepository.save(user2);
        //generate a new user object
        User user3 = new User("John", "", "");
        //save the user object to the database
        userRepository.save(user3);
        //get all users from the database
        List<User> users = userRepository.findAll();
        //check if the users are returned from the database
        //assertEquals(users.size(), 3);
        assertEquals(3, users.stream().count());
    }
}
