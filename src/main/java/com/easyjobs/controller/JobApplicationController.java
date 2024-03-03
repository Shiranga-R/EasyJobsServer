package com.easyjobs.controller;

import com.easyjobs.common.ApplicationStatus;
import com.easyjobs.common.PageAndSortParam;
import com.easyjobs.entity.JobApplication;
import com.easyjobs.service.JobApplicationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/job-application")
public class JobApplicationController {

    @Autowired
    private JobApplicationService jobApplicationService;

    @GetMapping("get-job-applications-by-user-status")
    public Page<JobApplication> getJobApplicationsByUserAndStatus(@RequestParam Long userId, @RequestParam ApplicationStatus status, @RequestBody PageAndSortParam pageAndSortParam) {
        return jobApplicationService.getJobApplicationsByUserAndStatus(userId, status, pageAndSortParam);
    }

    @GetMapping("get-job-applications-by-job-status")
    public Page<JobApplication> getJobApplicationsByJobAndStatus(@RequestParam Long jobId, @RequestParam ApplicationStatus status, @RequestBody PageAndSortParam pageAndSortParam) {
        return jobApplicationService.getJobApplicationsByJobAndStatus(jobId, status, pageAndSortParam);
    }

    @PostMapping("/save")
    public JobApplication save(JobApplication jobApplication) {
        return jobApplicationService.save(jobApplication);
    }

    @PutMapping("/update")
    public JobApplication update(JobApplication jobApplication) {
        return jobApplicationService.save(jobApplication);
    }
}
