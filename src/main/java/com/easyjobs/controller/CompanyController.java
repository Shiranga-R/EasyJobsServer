package com.easyjobs.controller;

import com.easyjobs.entity.Company;
import com.easyjobs.service.CompanyService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/company")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @GetMapping("/all")
    public List<Company> getAll() {
        return companyService.getAll();
    }

    @GetMapping("/get-by-id/{id}")
    public Company getById(Long id) {
        return companyService.getById(id);
    }

    @GetMapping("/get-by-active/{active}")
    public List<Company> getByActive(Boolean active) {
        return companyService.getByActive(active);
    }

    @PostMapping("/save")
    public Company save(@RequestBody Company company) {
        return companyService.save(company);
    }

    @PutMapping("/update")
    public Company update(@RequestBody Company company) {
        return companyService.save(company);
    }
}
