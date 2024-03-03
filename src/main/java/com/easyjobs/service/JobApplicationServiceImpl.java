package com.easyjobs.service;

import com.easyjobs.common.ApplicationStatus;
import com.easyjobs.common.PageAndSortParam;
import com.easyjobs.entity.JobApplication;
import com.easyjobs.repository.JobApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class JobApplicationServiceImpl implements JobApplicationService {

    @Autowired
    private JobApplicationRepository jobApplicationRepository;

    @Override
    public Page<JobApplication> getJobApplicationsByUserAndStatus(Long userId, ApplicationStatus applicationStatus, PageAndSortParam pageAndSortParam) {

        Pageable pageable = pageAndSortParam.getPageable();
        return jobApplicationRepository.getJobApplicationsByUserAndStatus(userId,applicationStatus,pageAndSortParam.getPageable());
    }

    @Override
    public Page<JobApplication> getJobApplicationsByJobAndStatus(Long jobId, ApplicationStatus applicationStatus, PageAndSortParam pageAndSortParam) {
        return jobApplicationRepository.getJobApplicationsByJobAndStatus(jobId, applicationStatus, pageAndSortParam.getPageable());
    }

    @Override
    public JobApplication save(JobApplication jobApplication) {
        return jobApplicationRepository.save(jobApplication);
    }
}
