package com.project.toDoList.service;

import com.project.toDoList.dto.UserCreateWithPasswordDTO;
import com.project.toDoList.dto.UserDTO;
import com.project.toDoList.mapper.UserMapper;
import com.project.toDoList.mapper.UserWithPasswordMapper;
import com.project.toDoList.model.User;
import com.project.toDoList.passwordEncoder.PasswordEncoderConfig;
import com.project.toDoList.repository.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoderConfig;

    public UserService(UserRepository userRepository, PasswordEncoder passwordEncoderConfig) {
        this.userRepository = userRepository;
        this.passwordEncoderConfig = passwordEncoderConfig;
    }

    public List<UserDTO> getAllUsers() {
        List<User> users = userRepository.findAll();
        return users.stream()
                .map(UserMapper::toDto)
                .collect(Collectors.toList());
    }

    public UserDTO getUserById(Long id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));
        return UserMapper.toDto(user);
    }

    public UserCreateWithPasswordDTO createUser(UserCreateWithPasswordDTO userDTO) {
        User user = UserWithPasswordMapper.toEntity(userDTO);
        user.setPassword(passwordEncoderConfig.encode(user.getPassword()));
        User savedUser = userRepository.save(user);
        return UserWithPasswordMapper.toDto(savedUser);
    }

    public UserDTO updateUser(Long id, UserDTO userDTO) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));
        user.setUsername(userDTO.getUsername());
        user.setEmail(userDTO.getEmail());
      //user.setPassword(userDTO.getPassword()); // Password should not be updated through DTO
        User updatedUser = userRepository.save(user);
        return UserMapper.toDto(updatedUser);
    }

    public void deleteUser(Long id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));
        userRepository.delete(user);
    }


}
