package com.project.toDoList.controller;

import com.project.toDoList.dto.TaskDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.project.toDoList.service.TaskService;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private final TaskService taskService;

    //Constructor injection
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }




    //Restituisce tutte le task
    @GetMapping
    public ResponseEntity<List<TaskDTO>> getAllTasks () {
        return ResponseEntity.ok(taskService.getTasks());
    }

    //Restituisce le task tramite id
    @GetMapping("/{id}")
    public ResponseEntity<TaskDTO> getTaskById(@PathVariable Long id) {
        return ResponseEntity.ok(taskService.getTaskById(id));
    }

    //Crea Task
    @PostMapping
    public ResponseEntity<TaskDTO> createTask(@RequestBody TaskDTO taskDTO) {

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(taskService.createTask(taskDTO));
    }


}
