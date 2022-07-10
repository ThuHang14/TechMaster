package com.example.demouserjpa;

import com.example.demouserjpa.dto.UserDto;
import com.example.demouserjpa.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest
public class UserTest {
    @Autowired
    UserRepository userRepository;


    @Test
    void findUserByEmailDto() {
        UserDto dto = userRepository.findByEmail("@a");
        assertThat(dto.getEmail()).isEqualTo("@a");
    }
}
