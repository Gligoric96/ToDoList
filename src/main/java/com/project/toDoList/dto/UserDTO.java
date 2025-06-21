package com.project.toDoList.dto;


public class UserDTO {

    private Long id;
    private String username;
    private String email;
    // Password is intentionally omitted from DTO to avoid exposing sensitive information

    // Default constructor
    public UserDTO() {}

    public UserDTO(Long id, String username, String email) {
        this.id = id;
        this.username = username;
        this.email = email;
    }




    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

//    public String getPassword() {
//        return null; // Password should not be exposed in DTO
//    }

//    public void setPassword(String password) {
//        // Password should not be set in DTO
//        throw new UnsupportedOperationException("Password cannot be set in UserDTO");
//    }
}