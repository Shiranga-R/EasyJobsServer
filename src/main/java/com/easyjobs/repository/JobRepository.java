package com.easyjobs.repository;

import com.easyjobs.entity.Job;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JobRepository extends JpaRepository<Job, Long> {

    public List<Job> findByActive(Boolean isActive);

}
