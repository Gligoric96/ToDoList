package com.project.toDoList.service;

import com.project.toDoList.dto.TaskDTO;
import com.project.toDoList.exception.TaskNotFoundException;
import com.project.toDoList.mapper.TaskMapper;
import com.project.toDoList.model.Task;
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
                .orElseThrow(() -> new TaskNotFoundException(id));

        return TaskMapper.toDTO(task);
    }


    //Crea Task
    public TaskDTO createTask(TaskDTO taskDTO) {

        Task task = taskRepository.save(TaskMapper.toEntity(taskDTO));

        return TaskMapper.toDTO(task);
    }


    //Aggiorna una Task
    public TaskDTO updateTask(Long id, TaskDTO taskDTO) {

        Task task = taskRepository.findById(id)
                .orElseThrow(() -> new TaskNotFoundException(id));
        task.setTitle(taskDTO.getTitle());
        task.setDescription(taskDTO.getDescription());
        task.setDueDate(taskDTO.getDueDate());
        task.setCompleted(taskDTO.isCompleted());

        taskRepository.save(task);

        return TaskMapper.toDTO(task);
    }


    //Cancella Task
    public TaskDTO deleteTask(Long id) {

        Task task = taskRepository.findById(id)
                .orElseThrow(() -> new TaskNotFoundException(id));

        taskRepository.delete(task);

        return TaskMapper.toDTO(task);
    }

}
