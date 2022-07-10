package com.example.demologin.service;

import com.example.demologin.model.User;

import java.util.Optional;

public interface UserService {
    public User login(String email, String password);

    public boolean logout(String email);

    public User addUser(String fullName, String email, String pass);

    public User activateUser(String fullName, String email, String password);


    public boolean updateUser(String email, String password);

    public boolean updateEmail(String email, String newEmail);

    public Optional<User> findByEmail(String email);

    public User findById(String id);
}
