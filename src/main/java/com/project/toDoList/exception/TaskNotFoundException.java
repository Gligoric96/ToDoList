package com.project.toDoList.exception;

public class TaskNotFoundException extends RuntimeException {
    public TaskNotFoundException(Long id) {
        super("Task con ID " + id + " non trovata");
    }
}
