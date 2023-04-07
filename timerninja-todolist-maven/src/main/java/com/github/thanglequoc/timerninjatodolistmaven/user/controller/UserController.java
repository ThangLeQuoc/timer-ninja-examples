package com.github.thanglequoc.timerninjatodolistmaven.user.controller;

import com.github.thanglequoc.timerninja.TimerNinjaTracker;
import com.github.thanglequoc.timerninjatodolistmaven.user.User;
import com.github.thanglequoc.timerninjatodolistmaven.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public User createNewUser(@RequestBody User user) {
        return userService.createNewUser(user);
    }
}
