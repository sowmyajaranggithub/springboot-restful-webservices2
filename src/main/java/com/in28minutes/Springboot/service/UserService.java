package com.in28minutes.Springboot.service;

import com.in28minutes.Springboot.dto.UserDto;
import com.in28minutes.Springboot.entity.User;

import java.util.List;

public interface UserService {
    UserDto createUser(UserDto user);
    UserDto getUserById(Long userId);

    List<UserDto> getAllUsers();
UserDto updateUser(UserDto user);
void deleteUser(Long userId);

}
