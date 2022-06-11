package com.example.demo.controller;

import com.example.demo.dto.UserDto;
import com.example.demo.request.CreateUserRequest;
import com.example.demo.request.UpdatePassRequest;
import com.example.demo.request.UpdateUserRequest;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class UserController {
  @Autowired private UserService userService;

  @GetMapping("/users")
  public List<UserDto> getUser() {
    return userService.getUsers();
  }

  @GetMapping("/users/search")
  public List<UserDto> searchUser(@RequestParam String name) {
    return userService.searchUsers(name);
  }

  @DeleteMapping("/users/{id}")
  public void deleteUser(@PathVariable int id) {
    userService.deleteUser(id);
  }

  @PostMapping("/users")
  @ResponseStatus(HttpStatus.CREATED)
  public UserDto createUser(@RequestBody CreateUserRequest request) {
    return userService.createUser(request);
  }

  @GetMapping("/users/{id}")
  public UserDto getUser(@PathVariable int id) {
    return userService.getUserById(id);
  }

  @PutMapping("users/{id}")
  public UserDto updateUser(@PathVariable int id, @RequestBody UpdateUserRequest request) {
    return userService.updateUser(id, request);
  }

  @PutMapping("users/{id}/update-password")
  public void updatePass(@PathVariable int id, @RequestBody UpdatePassRequest request) {
    userService.updatePassword(id, request);
  }

  @PostMapping("users/{id}/forgot-password")
  public String formatPassword(@PathVariable int id){
    return userService.forgotPassword(id);
  }
}
