package com.project.toDoList.mapper;

import com.project.toDoList.dto.UserCreateWithPasswordDTO;
import com.project.toDoList.model.User;

public class UserWithPasswordMapper {
    // This class is used to map the DTO with password
    public static UserCreateWithPasswordDTO toDto(User user) {
        if (user == null) {
            return null;
        }
        UserCreateWithPasswordDTO dto = new UserCreateWithPasswordDTO();
        dto.setId(user.getId());
        dto.setUsername(user.getUsername());
        dto.setPassword(user.getPassword());
        dto.setEmail(user.getEmail());
        return dto;
    }

    public static User toEntity(UserCreateWithPasswordDTO dto) {
        if (dto == null) {
            return null;
        }
        User user = new User();
        user.setId(dto.getId());
        user.setUsername(dto.getUsername());
        user.setPassword(dto.getPassword());
        user.setEmail(dto.getEmail());
        return user;
    }
}
