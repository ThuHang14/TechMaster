package com.example.demo.controller;

import com.example.demo.dto.UserDto;
import com.example.demo.request.CreateUserRequest;
import com.example.demo.request.UpdatePassRequest;
import com.example.demo.request.UpdateUserRequest;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class UserController {
    @Autowired
    private UserService userService;

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
    public String formatPassword(@PathVariable int id) {
        return userService.forgotPassword(id);
    }

    @PostMapping("/users/{id}/upload-file")
    public String uploadFile(@PathVariable int id, @ModelAttribute("file") MultipartFile file) {
        return userService.uploadFile(id, file);
    }

    //xem file
    @GetMapping(value = "users/{id}/files/{fileId}", produces = MediaType.IMAGE_JPEG_VALUE)
    public byte[] readFile(@PathVariable int id, @PathVariable String fileId) {
        return userService.readFile(id, fileId);
    }

    //xoa file
    @DeleteMapping("/users/{id}/files/{fileId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteFile(@PathVariable int id, @PathVariable String fileId) {
        userService.deleteFile(id, fileId);
    }

    //lay ds file
    @GetMapping("/users/{id}/files")
    public List<String> getFileList(@PathVariable int id) {
        return userService.getFileList(id);
    }

}
