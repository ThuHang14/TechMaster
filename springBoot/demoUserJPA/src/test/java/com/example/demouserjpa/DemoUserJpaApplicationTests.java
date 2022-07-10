package com.example.demouserjpa;

import com.example.demouserjpa.entity.User;
import com.example.demouserjpa.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest
class DemoUserJpaApplicationTests {


    @Autowired
    private UserRepository userRepository;


    @Test
    void insertUserTest() {
        User user1 = User.builder().name("a").email("@a2").build();
        User user2 = User.builder().name("b").email("@b3").build();
        User user3 =User.builder().name("c").email("@c4").build();

        userRepository.save(user1);
        userRepository.save(user2);
        userRepository.save(user3);

    }

    @Test
    void coundNameTest() {
        long count = userRepository.countByNameContainsIgnoreCase("b");
        assertThat(count).isEqualTo(1L);

    }

    @Test
    void sortNameDsc() {
        List<User> users = userRepository.findByOrderByNameDesc(Sort.by("name").descending());
        users.forEach(c -> System.out.println(c.getName()));

        assertThat(users.get(0).getName()).isEqualTo("c");
    }

    @Test
    void findByOrderByNameAscTest() {
        List<User> users = userRepository.findByOrderByNameAsc(PageRequest.of(0, 2));
        users.forEach(u -> System.out.println(u.getName()));
    }
}
