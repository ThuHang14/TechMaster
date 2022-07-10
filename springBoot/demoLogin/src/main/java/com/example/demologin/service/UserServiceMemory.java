package com.example.demologin.service;

import com.example.demologin.exception.UserException;
import com.example.demologin.hash.Hashing;
import com.example.demologin.model.State;
import com.example.demologin.model.User;
import com.example.demologin.repository.UserRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class UserServiceMemory implements UserService{
    private UserRepo userRepo;
    private Hashing hashing;

    @Override
    public User login(String email, String password) {
        Optional<User> o_user = userRepo.findByEmail(email);
        //Nếu user không tồn tại thì báo lỗi
        if (!o_user.isPresent()) {
            throw new UserException("User is not found");
        }

        User user = o_user.get();
        //User muốn login phải có trạng thái Active
        if (user.getState() != State.ACTIVE) {
            throw new UserException("User is not activated");
        }

        //Kiểm tra password
        if (hashing.validatePassword(password, user.getHashed_pass())) {
            return user;
        } else {
            throw new UserException("Password is incorrect");
        }
    }

    @Override
    public boolean logout(String email) {
        return false;
    }

    @Override
    public User addUser(String fullName, String email, String pass) {
        return userRepo.addUser(fullName, email,hashing.hashPassword(pass),State.ACTIVE);
    }

    @Override
    public User activateUser(String fullName, String email, String password) {
        return userRepo.addUser(fullName, email,hashing.hashPassword(password), State.ACTIVE);
    }

    @Override
    public boolean updateUser(String email, String password) {
        return false;
    }

    @Override
    public boolean updateEmail(String email, String newEmail) {
        return false;
    }

    @Override
    public Optional<User> findByEmail(String email) {
        return Optional.empty();
    }

    @Override
    public User findById(String id) {
        return null;
    }

}
