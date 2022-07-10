package com.example.demologin;

import com.example.demologin.model.State;
import com.example.demologin.model.User;
import com.example.demologin.repository.UserRepo;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;


public class TestUserRepo {
    @Test
    public void addUser(){
        UserRepo repo = new UserRepo();
       User user = repo.addUser("name","mail","123", State.PENDING);
        assertThat(user).isNotNull();
        System.out.println("id " + user.getId());
        assertThat(user.getId()).isNotNull();
        assertThat(user.getState()).equals(State.PENDING);
    }

    @Test
    public void emailExist() {
        UserRepo repo = new UserRepo();
        User user = repo.addUser("name1", "mail1", "1", State.PENDING);
        User user2 = repo.addUser("name2", "mail2", "2", State.PENDING);
        User user3 = repo.addUser("name3", "mail3", "3", State.PENDING);
        assertThat(repo.isEmailExist("MAIL1")).isTrue();
        assertThat(repo.isEmailExist("MAIL")).isFalse();
    }

    @Test
    public void emailFind() {
        UserRepo repo = new UserRepo();
        User user = repo.addUser("name1", "mail1", "1", State.PENDING);
        User user2 = repo.addUser("name2", "mail2", "2", State.PENDING);
        User user3 = repo.addUser("name3", "mail3", "3", State.PENDING);
        assertThat(repo.findByEmail("mail1")).isPresent();
        assertThat(repo.findByEmail("mail")).isNotPresent();

    }
    }
