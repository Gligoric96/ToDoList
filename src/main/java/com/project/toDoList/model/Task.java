package com.project.toDoList.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;



@Entity
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tasks")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private LocalDate dueDate;
    private boolean completed;




//    @Override
//    public String toString() {
//        return "User{" +
//                "title='" + title + '\'' +
//                ", description='" + description + '\'' +
//                ", dueDate='" + dueDate + '\'' +
//                ", completed=" + completed +
//                '}';
//    }
}
