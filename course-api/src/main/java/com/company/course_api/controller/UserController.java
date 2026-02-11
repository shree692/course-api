package com.company.course_api.controller;

import com.company.course_api.model.User;
import com.company.course_api.model.UserResponse;
import com.company.course_api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    // SIGNUP
    // POST http://localhost:8080/users
    @PostMapping
    public User signup(@RequestBody User user) {
        return userService.signup(user);
    }

    // GET ALL USERS (for dashboard list)
    // GET http://localhost:8080/users

    @GetMapping
    public List<UserResponse> getAllUsers() {
        return userService.getAllUsers();
    }


    // GET SINGLE USER BY ID
    // GET http://localhost:8080/users/{id}
    @GetMapping("/{id}")
    public User getUserById(@PathVariable String id) {
        return userService.getUserById(id);
    }
}
