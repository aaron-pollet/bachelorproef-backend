package com.example.bachelorproef;

import com.example.bachelorproef.model.User;
import com.example.bachelorproef.repository.UserRepository;
import com.example.bachelorproef.service.UserService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class BachelorproefApplication {

	public static void main(String[] args) {
		SpringApplication.run(BachelorproefApplication.class, args);
	}

	@Autowired
	UserRepository userRepository;
	@Autowired
	UserService userService;

	@PostConstruct
	public void initializeDatabase(){
		userService.saveUser(new User("John", "john@email.com", "password"));

	}

}
