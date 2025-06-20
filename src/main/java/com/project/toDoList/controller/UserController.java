package com.project.toDoList.controller;

import com.project.toDoList.dto.UserDTO;
import com.project.toDoList.model.User;
import com.project.toDoList.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;
    // Constructor injection
    public UserController(UserService userService) {
        this.userService = userService;
    }





    @GetMapping
    public ResponseEntity<List<UserDTO>> getAllUsers() {
        return ResponseEntity.ok(userService.getAllUsers());
}
}
