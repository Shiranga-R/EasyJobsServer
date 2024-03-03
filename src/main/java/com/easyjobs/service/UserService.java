package com.easyjobs.service;

import com.easyjobs.entity.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface UserService {

    public List<User> getAll();
    public List<User> getByActive(@PathVariable Boolean isActive);
    public User getById(@PathVariable Long id);
    public User save(@RequestBody User user);

}
