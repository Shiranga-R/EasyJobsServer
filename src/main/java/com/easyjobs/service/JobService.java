package com.easyjobs.service;

import com.easyjobs.entity.Job;

import java.util.List;

public interface JobService {

    public Job getById(long id);
    public List<Job> getAll();
    public List<Job> getByActive(boolean status);
    public Job save(Job job);
    public Job update(Job job);
}
