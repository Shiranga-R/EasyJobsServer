package com.easyjobs.service;

import com.easyjobs.common.ApplicationStatus;
import com.easyjobs.common.PageAndSortParam;
import com.easyjobs.entity.JobApplication;
import org.springframework.data.domain.Page;

import java.util.List;

public interface JobApplicationService {

    public Page<JobApplication> getJobApplicationsByUserAndStatus(Long userId, ApplicationStatus applicationStatus, PageAndSortParam pageAndSortParam);

    public Page<JobApplication> getJobApplicationsByJobAndStatus(Long jobId, ApplicationStatus applicationStatus, PageAndSortParam pageAndSortParam);

    public JobApplication save(JobApplication jobApplication);

}
