package com.example.userblogsql;

import com.example.userblogsql.dto.UserDto;
import com.example.userblogsql.entity.User;
import com.example.userblogsql.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserTest {


    @Autowired
    private UserRepository userRepository;


    @Test
    void get_user_dto_by_id_test() {
        UserDto userDto = userRepository.getUserDto(2);
        System.out.println(userDto);
    }

//    @Test
//    void get_user_info_by_id_test() {
//        UserInfos userInfos = userRepository.getUserById(2, UserInfos.class);
//        userInfos.showInfo();
//
//        User user = userRepository.getUserById(2, User.class);
//        System.out.println(user);
//    }


}
