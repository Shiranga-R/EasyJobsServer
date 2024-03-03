package com.easyjobs.repository;

import com.easyjobs.common.ApplicationStatus;
import com.easyjobs.entity.JobApplication;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.domain.Pageable;


public interface JobApplicationRepository extends JpaRepository<JobApplication, Long> {

    public Page<JobApplication> getJobApplicationsByUserAndStatus(Long userId, ApplicationStatus applicationStatus, Pageable pageable);

    public Page<JobApplication> getJobApplicationsByJobAndStatus(Long jobId, ApplicationStatus applicationStatus, Pageable pageable);
}
