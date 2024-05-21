package com.example.bachelorproef.util;
//write me a password hashing utility class that hashes and salts passwords
import org.springframework.security.crypto.bcrypt.BCrypt;
public class PasswordHashingUtil {
    //generate a method that hashes and salts a password
    public static String hashPassword(String password) {
        return BCrypt.hashpw(password, BCrypt.gensalt());
    }
}
