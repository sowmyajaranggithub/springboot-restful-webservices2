package com.in28minutes.Springboot.mapper;

import com.in28minutes.Springboot.dto.UserDto;
import com.in28minutes.Springboot.entity.User;

public class UserMapper {

    public static UserDto mapToUserDto(User user){
        UserDto userDto = new UserDto(
                user.getId(),
         user.getFirstName(),
        user.getLastName(),
        user.getEmail()
                );
    return userDto;
    }
    public static User mapToUser(UserDto userDto) {
        User user = new User(
                userDto.getId(),
                userDto.getFirstName(),
                userDto.getLastName(),
                userDto.getEmail()
        );
        return user;
    }

}
