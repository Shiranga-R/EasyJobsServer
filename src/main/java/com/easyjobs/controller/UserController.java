package com.easyjobs.controller;

import com.easyjobs.entity.User;
import com.easyjobs.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/all")
    public List<User> getAll() {
        return userService.getAll();
    }

    @GetMapping("get-by-active/{isActive}")
    public List<User> getByActive(@PathVariable Boolean isActive) {
        return userService.getByActive(isActive);
    }

    @GetMapping("get-by-id/{id}")
    public User getByActive(@PathVariable Long id) {
        return userService.getById(id);
    }

    @PostMapping("/save")
    public User save(@RequestBody User user) {
        return userService.save(user);
    }
}
