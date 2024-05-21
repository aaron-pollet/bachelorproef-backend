package com.example.bachelorproef;

import com.example.bachelorproef.model.User;
import com.example.bachelorproef.repository.UserRepository;
import com.example.bachelorproef.service.UserService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

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
		/*List<User> users = new ArrayList<>();
		users.add(new User("John", "john@email.com", "password"));
		users.add(new User("Tom", "tom@tom.com", "password"));
		users.add(new User("Jack", "jack_w@test.com", "password"));
		users.add(new User("Laurens", "laurens-p@test.be","password"));
		users.add(new User("Philippe", "phillipe@email.com", "password"));
		userRepository.saveAll(users); */
		userService.saveUser(new User("John", "john@email.com", "password"));

	}

}
