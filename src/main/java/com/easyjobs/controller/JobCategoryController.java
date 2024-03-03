package com.easyjobs.controller;

import com.easyjobs.entity.JobCategory;
import com.easyjobs.service.JobCategoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/job-category")
public class JobCategoryController {

    @Autowired
    private JobCategoryService jobCategoryService;

    @GetMapping("/get-all")
    public List<JobCategory> getAll() {
        return jobCategoryService.getAll();
    }

    @PostMapping("/save")
    public JobCategory save(JobCategory jobCategory) {
        return jobCategoryService.save(jobCategory);
    }
}
