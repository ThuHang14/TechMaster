package com.example.demologin;

import com.example.demologin.hash.Hashing;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.*;


import java.util.List;

@SpringBootTest
public class TestHash {
    @Autowired
    Hashing hashing;

    @Test
    public void hashPass(){
        var passwords = List.of("111@1313","222@","3313@");
        for (String password : passwords
             ) {
            String hashedPass = hashing.hashPassword(password);
            assertThat(hashedPass).isNotNull();
            System.out.println("PASS : "+hashedPass);
                    }
    }

    @Test
    public void validatePass(){
        var passwords = List.of("111@1313","222@","3313@");
        for (String password : passwords
        ) {
            String hashedPass = hashing.hashPassword(password);
            System.out.println("HASH : " + hashedPass);
            assertThat(hashing.validatePassword(password,hashedPass)).isTrue();
        }

        assertThat(hashing.validatePassword("password","1000:e2396d5fe77068e74cd4f59cf2010116:bfa5da7cf683db1187e64720e27a1d6fff533370256227b99cf3ab1eec81c010ccf4f6d7822a544c58a06a49c8f6ca2428d6ca5af8d444a1ff1299e5e28765e1")).isFalse();

    }

}
