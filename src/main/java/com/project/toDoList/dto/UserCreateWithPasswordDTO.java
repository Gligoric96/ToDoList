package com.project.toDoList.dto;

import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserCreateWithPasswordDTO {
    private Long id;
    private String username;
    private String password;
    private String email;

}
