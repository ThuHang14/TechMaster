package com.example.demo.service;

import com.example.demo.dto.UserDto;
import com.example.demo.exception.BadRequestException;
import com.example.demo.exception.NotFoundException;
import com.example.demo.mapper.UserMapper;
import com.example.demo.model.User;
import com.example.demo.request.CreateUserRequest;
import com.example.demo.request.UpdatePassRequest;
import com.example.demo.request.UpdateUserRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.multipart.MultipartFile;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class UserService {
    private List<User> users;

    @Autowired FileService fileService;

    public UserService() {
        initData();
    }

    private void initData() {
        users = new ArrayList<>();
        users.add(new User(1, "Nguyễn Văn A", "a@gmail.com", "0123456789", "Tỉnh Thái Bình", null, "111"));
        users.add(new User(2, "Trần Văn B", "b@gmail.com", "0123456789", "Tỉnh Nam Định", null, "222"));
        users.add(new User(3, "Ngô Thị C", "c@gmail.com", "0123456789", "Tỉnh Hưng Yên", null, "333"));
    }

    public List<UserDto> getUsers() {
        return users.stream().map(u -> UserMapper.toUserDto(u)).collect(Collectors.toList());
    }

    public List<UserDto> searchUsers(String name) {
        return users.stream().filter(user -> user.getName().toLowerCase().contains(name.toLowerCase())).map(UserMapper::toUserDto).collect(Collectors.toList());
    }

    public void deleteUser(int id) {
        if (findUser(id).isEmpty()) {
            throw new NotFoundException(("khong ton tai id = " + id));
        }

        users.removeIf(u -> u.getId() == id);
    }

    public UserDto createUser(CreateUserRequest request) {
        if (findUser(request.getEmail()).isPresent()) {
            throw new NotFoundException("email  " + request.getEmail() + "  da ton tai");
        }

        Random random = new Random();
        User user = new User();
        user.setId(random.nextInt(100 - 4 + 1) + 4);
        user.setName(request.getName());
        user.setEmail(request.getEmail());
        user.setPhone(request.getPhone());
        user.setAddress(request.getAddress());
        user.setPassword(request.getPassword());

        users.add(user);

        return UserMapper.toUserDto(user);
    }

    public Optional<User> findUser(String email) {
        return users.stream().filter(user -> Objects.equals(user.getEmail(), email)).findFirst();
    }

    public Optional<User> findUser(int id) {
        return users.stream().filter(user -> user.getId() == id).findFirst();
    }

    public UserDto getUserById(int id) {
        Optional<User> userOptional = findUser(id);
        if (userOptional.isEmpty()) {
            throw new NotFoundException("khong ton tai id :  " + id);
        }
        return UserMapper.toUserDto(userOptional.get());
    }

    public UserDto updateUser(int id, UpdateUserRequest request) {
        Optional<User> userOptional = findUser(id);
        if (userOptional.isEmpty()) {
            throw new NotFoundException("khong ton tai id :  " + id);
        }
        User user = userOptional.get();
        user.setName(request.getName());
        user.setPhone(request.getPhone());
        user.setAddress(request.getAddress());

        return UserMapper.toUserDto(user);
    }

    public void updatePassword(int id, UpdatePassRequest request) {
        Optional<User> userOptional = findUser(id);
        if (userOptional.isEmpty()) {
            throw new NotFoundException("khong ton tai id :  " + id);
        }
        User user = userOptional.get();

        // kiem tra old pass
        if (!user.getPassword().equals(request.getOldPassword())) {
            throw new BadRequestException("pass cu khong chinh xac ");
        }
        // old == new pass ?
        if (request.getOldPassword().equals(request.getNewPassword())) {
            throw new BadRequestException("pass cu va moi khong duoc trung ");
        }

        // tao ra pass moi
        user.setPassword(request.getNewPassword());
    }

    public String forgotPassword(int id) {
        Optional<User> userOptional = findUser(id);
        if (userOptional.isEmpty()) {
            throw new NotFoundException("khong ton tai id :  " + id);
        }
        User user = userOptional.get();
        //new pass
        Random rd = new Random();
        String password = String.valueOf(rd.nextInt(1000 - 100) + 100);
        user.setPassword(password);

        return password;
    }

    public String uploadFile(int id, MultipartFile file){
        if(findUser(id).isEmpty()){
            throw new NotFoundException("khong ton tai id :  " + id);
        }

        return  fileService.uploadFile(id,file);
    }

    //xem file
    public byte[] readFile(int id , String fileId){
return fileService.readFile(id,fileId);
    }

    //xoa file
    public void deleteFile(int id , String fileId){
        fileService.deleteFile(id,fileId);
    }
//lay file
    public List<String> getFileList( int id) {
        if(findUser(id).isEmpty()){
            throw new NotFoundException("khong ton tai id :  " + id);
        }

    return fileService.getFileList(id);
    }
}
