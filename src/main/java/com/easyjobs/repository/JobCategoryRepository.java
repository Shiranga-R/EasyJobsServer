package com.easyjobs.repository;

import com.easyjobs.entity.JobCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobCategoryRepository extends JpaRepository<JobCategory, Long> {
}
