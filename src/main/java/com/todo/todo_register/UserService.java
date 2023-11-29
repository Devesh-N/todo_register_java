package com.todo.todo_register;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public void createUser(String username, String password) {
        User newUser = new User();
        newUser.setUsername(username);
        newUser.setPassword(password); // In a real-world scenario, hash the password
        userRepository.save(newUser);
    }
}
