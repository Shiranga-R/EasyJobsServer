package com.easyjobs.service;

import com.easyjobs.entity.Job;
import com.easyjobs.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobServiceImpl implements JobService {

    @Autowired
    private JobRepository jobRepository;

    @Override
    public Job getById(long id) {
        return jobRepository.findById(id).get();
    }

    @Override
    public List<Job> getAll() {
        return jobRepository.findAll();
    }

    @Override
    public List<Job> getByActive(boolean status) {
        return jobRepository.findByActive(status);
    }

    @Override
    public Job save(Job job) {
        return jobRepository.save(job);
    }

    @Override
    public Job update(Job job) {
        return jobRepository.save(job);
    }
}
