package com.example.springdatahibernate.services;

import com.example.springdatahibernate.entities.Company;
import com.example.springdatahibernate.jparepositories.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CompanyServiceImpl implements CompanyService{

    @Autowired
    private CompanyRepository companyRepository;

    @Override
    public Company findByName(String name) {
        return companyRepository.findByName(name).orElse(null);
    }
}
