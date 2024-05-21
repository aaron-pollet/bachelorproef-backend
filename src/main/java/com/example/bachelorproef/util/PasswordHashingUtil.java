package com.example.bachelorproef.util;
import org.springframework.security.crypto.bcrypt.BCrypt;

//write me a password hashing utility class that hashes and salts passwords

public class PasswordHashingUtil {
    public static String hashPassword(String password) {
        return BCrypt.hashpw(password, BCrypt.gensalt());
    }
}
