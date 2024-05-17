package com.example.bachelorproef.model;

//generate a user class used as an entity in a database table
//this class is used to store user information

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;

//toegevoegd voor vergelijking
@EqualsAndHashCode
@Entity // achteraf toegevoegd
@Getter // achteraf
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    //generate a public getter method for the user email
    //generate a private field for the user email
    private String email;
    //generate a public getter method for the user password
    //generate a private field for the user passwordcomm
    private String password;

    //generate a public constructor for the user class
    public User() {
    }
    //generate a public constructor for the user class with the user id, user name, user email and user password
    public User(String name, String email /*, String password*/) {
        this.name = name;
        this.email = email;
        //this.password = password;
    }

    //generate a public setter method for the user id
    public void setId(Long id) {
        this.id = id;
    }

    //generate a public setter method for the user name
    public void setName(String name) {
        this.name = name;
    }

    //generate a public setter method for the user email
    public void setEmail(String email) {
        this.email = email;
    }

    //generate a public setter method for the user password
    public void setPassword(String password) {
        this.password = password;
    }

}
