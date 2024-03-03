package com.easyjobs.service;

import com.easyjobs.entity.JobCategory;
import com.easyjobs.repository.JobCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobCategoryServiceImpl implements JobCategoryService {

    @Autowired
    private JobCategoryRepository jobCategoryRepository;

    @Override
    public List<JobCategory> getAll() {
        return jobCategoryRepository.findAll();
    }

    @Override
    public JobCategory save(JobCategory jobCategory) {
        return jobCategoryRepository.save(jobCategory);
    }
}
