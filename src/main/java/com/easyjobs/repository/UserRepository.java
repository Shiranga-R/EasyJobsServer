package com.easyjobs.repository;

import com.easyjobs.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Long> {

    public List<User> findByActive(Boolean active);
    public User findByEmail(String email);
}
