package com.example.demologin;

import com.example.demologin.exception.UserException;
import com.example.demologin.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.*;

@SpringBootTest
public class TestUserMemory {
    @Autowired
    UserService userService;

    @Test
    public void TestAccountPENDING(){
        userService.addUser("name1","mail1@mail.com","pass1");
        userService.addUser("name2","mail2@mail.com","pass2");
        userService.addUser("name3","mail3@mail.com","pass3");
        userService.addUser("name4","mail4@mail.com","pass4");

        assertThatThrownBy(() -> {
            userService.login("mail1@mail.com","pass1");
        }).isInstanceOf(UserException.class)
                .hasMessageContaining("user is not actived");
    }
}
