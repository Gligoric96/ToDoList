package com.project.toDoList.service;

import com.project.toDoList.dto.UserDTO;
import com.project.toDoList.mapper.UserMapper;
import com.project.toDoList.model.User;
import com.project.toDoList.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class UserService {

    private final UserRepository userRepository;
    // Constructor injection
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }



    public List<UserDTO> getAllUsers() {
        List<User> users = userRepository.findAll();
        return users.stream()
                .map(UserMapper::toDto)
                .collect(Collectors.toList());
    }


}
