package com.example.demo.mapper;

import com.example.demo.dto.UserDto;
import com.example.demo.model.User;

public class UserMapper {
  public static UserDto toUserDto(User user){
	UserDto userDto = new UserDto();
	userDto.setId(user.getId());
	userDto.setAddress(user.getAddress());
	userDto.setEmail(user.getEmail());
    userDto.setAvatar(user.getAvatar());
	userDto.setName(user.getName());
	userDto.setPhone(user.getPhone());
	return userDto;
  }
}
