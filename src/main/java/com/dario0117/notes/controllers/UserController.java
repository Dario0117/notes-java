package com.dario0117.notes.controllers;

import com.dario0117.notes.entities.Note;
import com.dario0117.notes.entities.User;
import com.dario0117.notes.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/auth")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping(value = "register")
    public User create(@RequestBody User user) {
        return userService.create(user);
    }

    @PostMapping(value = "login")
    public Iterable<User> index() {
        return userService.list();
    }

    @GetMapping(value = "profile")
    public User getById(@PathVariable Integer id) {
        return userService.get(id);
    }
}
