package com.todo.todo_register;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
public class User {
    @Id
    private String id;

    private String username;
    private String password;

    // Constructor
    public User() {}

    // Username getter and setter
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    // Password getter and setter
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Optionally, if you want a getter for the id
    public String getId() {
        return id;
    }
}

