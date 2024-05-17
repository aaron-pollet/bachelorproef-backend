package com.example.bachelorproef;


import com.example.bachelorproef.controller.UserController;
import com.example.bachelorproef.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

//generate a test class that tests the endpoints in the UserController to class
//This class is used to test the UserController.java class
@SpringBootTest
public class UserControllerTest {

        //generate a private field for the user controller
        @Autowired
        UserController userController;

        //generate a test method to test the saveUser method
        @Test
        void testSaveUser() {
            //generate a new user object
            User user = new User("John", "");
            //save the user object to the database
            userController.saveUser(user);
            //check if the user object is saved to the database
            assertEquals(userController.getUserById(user.getId()), user);    //aanpassing findById naar getUserById
        }

}

