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

        @Autowired
        UserController userController;

        @Test
        void testSaveUser() {
            User user = new User("John", "john@email.com", "password");
            userController.saveUser(user);
            assertEquals(userController.getUserById(user.getId()), user);    //aanpassing findById naar getUserById
        }

}

