package com.project.toDoList.dto;

import lombok.*;

import java.time.LocalDate;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TaskDTO {

    private Long id;
    private String title;
    private String description;
    private LocalDate dueDate;
    @Builder.Default //per forzare il campo a false per swagger e lombok
    private boolean completed = false;
    private Long userId; // Optional, if you want to include user information

}
