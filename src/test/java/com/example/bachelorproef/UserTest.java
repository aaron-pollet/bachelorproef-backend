package com.example.bachelorproef;

import com.example.bachelorproef.model.User;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

//write a testclass for the User.java class
//this class is used to test the User.java class
class UserTest {
    //generate a test method to test the user class
    @Test
    void testUser() {
        //generate a new user object
        //User user = new User();
        //generate a new user object with the user id, user name, user email and user password
        User user1 = new User("John", ""); //zelf haakje sluiten?
        //generate a new user object with the user id, user name, user email and user password
        User user2 = new User("John", "john@email.com"); //zelf haakje sluiten? + email toevoegen
        //generate a new user object with the user id, user name, user email and user password
        User user3 = new User("Bert", "bert@test.be"); //zelf haakje sluiten? + email + naam verandert
        //generate a new user object with the user id, user name, user email and user password
        User user4 = new User("", ""); //zelf haakje sluiten? zelf de parameter name leeggelaten
        //toevoegen van een user met dezelfde paramatere
        User user5 = new User("John", "john@email.com");

        //copilot genereert 4 verschillende users, maar telkenes met dezelfde waarden, op die manier kan je geen
        //verschillende objecten testen

        //hier moet ik zelf ingrijpen en iets ander typen dan wat er staat
        //genertate the test methods to test the user class
        /*assertEquals(user.getName(), "");
        assertEquals(user.getEmail(), "");
        assertEquals(user.getPassword(), null);*/
        assertEquals(user1.getName(), "John");
        assertEquals(user1.getEmail(), "");
        assertEquals(user2.getName(), "John");
        assertEquals(user2.getEmail(), "john@email.com");
        //zelf toegevoegd
        assertEquals(user2, user5);
    }
}
// Ik moet zelf de haakjes sluiten. Als je niet zelf ingrijpt en de testmethode afsluit, blijft copilot dezelfde code genereren
//er werden in de User enkel setters toegevoegd, geen getters. Ik voeg manueel @Data toe aan de User class