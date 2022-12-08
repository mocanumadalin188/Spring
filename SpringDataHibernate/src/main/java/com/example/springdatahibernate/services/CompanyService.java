package com.example.springdatahibernate.services;

import com.example.springdatahibernate.entities.Company;

public interface CompanyService {
    Company findByName(String name);
}
