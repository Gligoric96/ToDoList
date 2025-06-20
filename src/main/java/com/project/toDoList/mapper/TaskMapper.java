package com.project.toDoList.mapper;

import com.project.toDoList.dto.TaskDTO;
import com.project.toDoList.model.Task;

public class TaskMapper {

    public static Task toEntity(TaskDTO taskDTO) {
        if (taskDTO == null) return null;
        return new Task(
                taskDTO.getId(),
                taskDTO.getTitle(),
                taskDTO.getDescription(),
                taskDTO.getDueDate(),
                taskDTO.isCompleted()
        );
    }

    public static TaskDTO toDTO(Task task) {
        if (task == null) return null;
        return new TaskDTO(
                task.getId(),
                task.getTitle(),
                task.getDescription(),
                task.getDueDate(),
                task.isCompleted());
    }
}
