package com.example.bachelorproef;


//import the necessary classes
import com.example.bachelorproef.model.User;
import com.example.bachelorproef.service.UserService;
import com.example.bachelorproef.service.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

//Generate a test class to test the UserService.java class
//This class is used to test the UserService.java class
@SpringBootTest
public class UserServiceTest {

        //generate a private field for the user service
        @Autowired
        UserService userService;

        //generate a test method to test the saveUser method
        @Test
        void testSaveUser() {
            //generate a new user object
            User user = new User("John", "");
            //save the user object to the database
            userService.saveUser(user);
            //check if the user object is saved to the database
            assertEquals(userService.findById(user.getId()), user);
        }
}
