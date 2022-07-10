package com.example.demologin;

import com.example.demologin.model.User;
import com.example.demologin.service.UserService;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class TestUserService {
  @Autowired
  private UserService userService;
    @Test
public void addUser(){
      User user=  userService.addUser("abs","abc@gmail","pass123");

      assertThat(user).isNotNull();
    }
}
