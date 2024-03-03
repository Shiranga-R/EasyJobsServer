package com.easyjobs.service;

import com.easyjobs.entity.Company;

import java.util.List;

public interface CompanyService {

    public Company save(Company company);

    public Company getById(Long id);

    public List<Company> getAll();

    public List<Company> getByActive(Boolean active);

}
