package com.easyjobs.service;

import com.easyjobs.entity.JobCategory;

import java.util.List;
import java.util.TreeMap;

public interface JobCategoryService {

    public List<JobCategory> getAll();

    public JobCategory save(JobCategory jobCategory);

}
