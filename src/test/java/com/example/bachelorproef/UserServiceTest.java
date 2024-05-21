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

        @Test
        void testSaveUser() {
            User user = new User("John", "john@email.com", "password");
            userService.saveUser(user);
            assertEquals(userService.findById(user.getId()), user);
        }
}
