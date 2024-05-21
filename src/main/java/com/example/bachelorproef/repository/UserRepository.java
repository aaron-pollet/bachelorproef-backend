package com.example.bachelorproef.repository;

import com.example.bachelorproef.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

//generate a repository to interact with a mysql database
//this class is used to interact with a database

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    //generate a public setter method for the user password
    //void setPassword(String password);

    //generate a public method to find a user by email
    //generate query to find a user by email
    @Query("SELECT u FROM User u WHERE u.email = ?1")
    User findByEmail(String email);

    //generate a public method to find a user by email and password
    //generate query to find a user by email and password
    @Query("SELECT u FROM User u WHERE u.email = ?1 AND u.password = ?2")
    User findByEmailAndPassword(String email, String password);

    //generate a public method to find a user by name
    //generate query to find a user by name
    @Query("SELECT u FROM User u WHERE u.name = ?1")
    User findByName(String name);

    //generate a public method to find a user by name and password
    //generate query to find a user by name and password
    @Query("SELECT u FROM User u WHERE u.name = ?1 AND u.password = ?2")
    User findByNameAndPassword(String name, String password);

    //generate a public method to find a user by id
    //generate query to find a user by id
    @Query("SELECT u FROM User u WHERE u.id = ?1")
    Optional<User> findById(Long id);

    //generate a public method to delete a user by id
    //generate query to delete a user by id
    @Query("DELETE FROM User u WHERE u.id = ?1")
    void deleteById(Long id);



//    //TODO verwijderen of aanpassen. Dit dient als voorbeeld hoe het niet moet, denk ik
//    //verkeerde query die SQL-injection veroorzaakt
//    //dit is niet gegenereerd door Github Copilot
//    @Query("select u from User u where u.name = :name")
//    List<User> findByNameWrong(@Param("name") String name);
//
//    //verkeerde query die SQL-injection veroorzaakt
//    //dit is niet gegenereerd door Github Copilot / ik denk dat dit de zaak oplost
//    @Query(value = "select u from User u where u.name = :name and u.password = :password", nativeQuery = true)
//    User findByNameNative(@Param("name") String name);
}
