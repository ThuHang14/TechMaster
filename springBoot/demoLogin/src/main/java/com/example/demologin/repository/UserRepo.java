package com.example.demologin.repository;

import com.example.demologin.model.State;
import com.example.demologin.model.User;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class UserRepo {
private ConcurrentHashMap <String , User> concurentHashMap = new ConcurrentHashMap<>();

public User addUser(String fullName , String email , String hasshed_pass, State state){
    String id = UUID.randomUUID().toString();
    User user = User.builder()
            .id(id)
            .fullName(fullName)
            .hashed_pass(hasshed_pass)
            .state(state)
            .build();

    concurentHashMap.put(id,user);
    return user;
}

public boolean isEmailExist(String email){
    //return users.values().stream().anyMatch(o1->o1.getEmail().equalsIgnoreCase(email));
    return concurentHashMap.values().stream().filter(u -> u.getEmail().equalsIgnoreCase(email)).count() > 0;
}

public Optional<User> findByEmail(String email){
    return concurentHashMap.values().stream().filter(u -> u.getEmail().equalsIgnoreCase(email)).findFirst();
}

public void update(User user){
    concurentHashMap.put(user.getId(),user);
}
}
