package com.mywork.springtestcontainers.controller;

import com.mywork.springtestcontainers.domain.User;
import com.mywork.springtestcontainers.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping(path = "")
    @ResponseStatus(HttpStatus.CREATED)
    public User saveUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @GetMapping(path = "/{id}")
    public User findUserById(@PathVariable String id) {
        return userService.findUserById(id);
    }

    @GetMapping(path = "")
    public List<User> getUsers() {
        return userService.findAllUsers();
    }
}