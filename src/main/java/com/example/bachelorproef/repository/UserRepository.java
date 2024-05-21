package com.example.bachelorproef.repository;

import com.example.bachelorproef.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

//generate a repository to interact with a mysql database
//this class is used to interact with a database

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    @Query("SELECT u FROM User u WHERE u.email = ?1")
    User findByEmail(String email);

    @Query("SELECT u FROM User u WHERE u.email = ?1 AND u.password = ?2")
    User findByEmailAndPassword(String email, String password);

    @Query("SELECT u FROM User u WHERE u.name = ?1")
    User findByName(String name);

    @Query("SELECT u FROM User u WHERE u.name = ?1 AND u.password = ?2")
    User findByNameAndPassword(String name, String password);

    @Query("SELECT u FROM User u WHERE u.id = ?1")
    Optional<User> findById(Long id);

    @Query("DELETE FROM User u WHERE u.id = ?1")
    void deleteById(Long id);
}
