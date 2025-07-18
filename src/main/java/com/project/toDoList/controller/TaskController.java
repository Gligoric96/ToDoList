package com.project.toDoList.controller;

import com.project.toDoList.dto.TaskDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.project.toDoList.service.TaskService;

import java.util.List;

@Slf4j
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

    //Restituisce tutte le task di un User
    @GetMapping({"/user/{userId}"})
    public ResponseEntity<List<TaskDTO>> getAllUserTasks (@PathVariable Long userId){

        List<TaskDTO> tasks = taskService.getTaskByUserId(userId);
        return ResponseEntity.ok(tasks);
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

    //Aggiorno una task
    @PutMapping("/{id}")
    public ResponseEntity<TaskDTO> updateTask(@PathVariable Long id, @RequestBody TaskDTO taskDTO) {
            return ResponseEntity.ok(taskService.updateTask(id, taskDTO));

    }

    //Cancello una task
    @DeleteMapping("/{id}")
    public ResponseEntity<TaskDTO> deleteTask(@PathVariable Long id) {
        return ResponseEntity.ok(taskService.deleteTask(id));
    }

}
