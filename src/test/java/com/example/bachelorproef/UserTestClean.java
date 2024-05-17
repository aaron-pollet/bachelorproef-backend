package com.example.bachelorproef;

import com.example.bachelorproef.model.User;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

//write a testclass for the User.java class
//this class is used to test the User.java class
class UserTestClean {
    //generate a test method to test the user class
    @Test
    void testUser() {

        User user1 = new User("John", "");
        User user2 = new User("John", "john@email.com");
        User user3 = new User("Bert", "bert@test.be");
        User user4 = new User("", "");

        assertEquals(user1.getName(), "John");
        assertEquals(user1.getEmail(), "");
        assertEquals(user2.getName(), "John");
        assertEquals(user2.getEmail(), "john@email.com");
        assertEquals(user3.getName(), "Bert");
        assertEquals(user3.getEmail(), "bert@test.be");
        assertEquals(user4.getName(), "");
        assertEquals(user4.getEmail(), "");
    }
}