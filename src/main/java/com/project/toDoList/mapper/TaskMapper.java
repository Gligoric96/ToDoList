package com.project.toDoList.mapper;

import com.project.toDoList.dto.TaskDTO;
import com.project.toDoList.model.Task;

public class TaskMapper {

    public static Task toEntity(TaskDTO taskDTO) {
        Task task = new Task();
        task.setId(taskDTO.getId());
        task.setDescription(taskDTO.getDescription());
        task.setTitle(taskDTO.getTitle());
        task.setDueDate(taskDTO.getDueDate());
        task.setCompleted(taskDTO.isCompleted());

        return task;
    }

    public static TaskDTO toDTO(Task task) {
        TaskDTO taskDTO = new TaskDTO();
        taskDTO.setId(task.getId());
        taskDTO.setDescription(task.getDescription());
        taskDTO.setTitle(task.getTitle());
        taskDTO.setDueDate(task.getDueDate());
        taskDTO.setCompleted(task.isCompleted());

        return taskDTO;
    }
}
