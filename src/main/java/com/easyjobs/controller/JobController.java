package com.easyjobs.controller;

import com.easyjobs.entity.Job;
import com.easyjobs.service.JobService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("api/job")
public class JobController {

    @Autowired
    private JobService jobService;

    @GetMapping("/all")
    public List<Job> getAll() {
        return jobService.getAll();
    }
    @GetMapping("/get-by-id/{id}")
    public Job getById(@PathVariable long id) {
        return jobService.getById(id);
    }

    @GetMapping("/get-by-status/{status}")
    public List<Job> getAllByStatus(@PathVariable boolean status) {
        return jobService.getByActive(status);
    }

    @PostMapping("/save")
    public Job save(@RequestBody Job job) {
        return jobService.save(job);
    }

    @PutMapping("/update")
    public Job update(@RequestBody Job job) {
        return jobService.update(job);
    }

}
