package com.project.toDoList.dto;

import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {

    private Long id;
    private String username;
    private String email;
    // Password is intentionally omitted from DTO to avoid exposing sensitive information


}