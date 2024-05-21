package com.example.bachelorproef;


//import the necessary classes
import com.example.bachelorproef.model.User;
import com.example.bachelorproef.repository.UserRepository;
import com.example.bachelorproef.service.UserService;
import com.example.bachelorproef.service.UserServiceImpl;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

//Generate a test class to test the UserService.java class
//This class is used to test the UserService.java class
@SpringBootTest
public class UserServiceTest {

        //generate a private field for the user service
        @Autowired
        UserService userService;

        @Autowired
        UserRepository userRepository;

    //setup the database with some users
        @BeforeEach
        @AfterEach
        void setupDatabase() {
            //generate a new user object
            userRepository.deleteAll();
            List<User> users = new ArrayList<>();
            users.add(new User("John", "john@email.com", "password"));
            users.add(new User("Tom", "tom@tom.com", "password"));
            users.add(new User("Jack", "jack_w@test.com", "password"));
            users.add(new User("Laurens", "laurens-p@test.be", "password"));
            users.add(new User("Philippe", "phillipe@email.com", "password"));
            userRepository.saveAll(users);
        }

        //generate a test method to test the saveUser method
        @Test
        void testSaveUser() {
            //generate a new user object
            User user = new User("John", "john@email.com", "password");
            //save the user object to the database
            userService.saveUser(user);
            //check if the user object is saved to the database
            assertEquals(userService.findById(user.getId()), user);
        }
}
