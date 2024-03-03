package com.easyjobs.repository;

import com.easyjobs.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CompanyRepository extends JpaRepository<Company, Long> {

    public List<Company> getByActive(Boolean active);
}
