package com.project.toDoList.service;

import com.project.toDoList.dto.TaskDTO;
import com.project.toDoList.mapper.TaskMapper;
import com.project.toDoList.model.Task;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;
import com.project.toDoList.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TaskService {


    private final TaskRepository taskRepository;

    //Constructor injection
    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }






    //Restituisce tutte le task
    public List<TaskDTO> getTasks() {

        List<Task> tasks = taskRepository.findAll();

        return tasks.stream()
                .map(TaskMapper::toDTO)
                .collect(Collectors.toList());
    }


    //Restituisce la task tramite id
    public TaskDTO getTaskById(Long id) {

        Task task = taskRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Task non trovata!"));

        return TaskMapper.toDTO(task);
    }


    //Crea Task
    public TaskDTO createTask(TaskDTO taskDTO) {

        Task savedTask = taskRepository.save(TaskMapper.toEntity(taskDTO));

        return TaskMapper.toDTO(savedTask);
    }



}
