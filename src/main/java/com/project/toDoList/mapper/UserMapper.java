package com.project.toDoList.mapper;

import com.project.toDoList.dto.UserDTO;
import com.project.toDoList.model.User;

public class UserMapper {
    public static UserDTO toDto(User user) {
        return new UserDTO(user.getId(), user.getUsername(), user.getEmail());
    }

    public static User toEntity(UserDTO userDTO) {
        return User.builder()
                .username(userDTO.getUsername())
                .email(userDTO.getEmail())
                .build();
    }}