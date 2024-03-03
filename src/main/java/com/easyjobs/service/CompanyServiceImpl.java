package com.easyjobs.service;

import com.easyjobs.entity.Company;
import com.easyjobs.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    CompanyRepository companyRepository;

    @Override
    public Company save(Company company) {
        return companyRepository.save(company);
    }

    @Override
    public Company getById(Long id) {
        return companyRepository.findById(id).get();
    }

    @Override
    public List<Company> getAll() {
        return companyRepository.findAll();
    }

    @Override
    public List<Company> getByActive(Boolean active) {
        return companyRepository.getByActive(active);
    }
}
