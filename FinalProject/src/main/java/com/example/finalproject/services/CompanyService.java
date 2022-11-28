package com.example.finalproject.services;

import com.example.finalproject.entities.Company;
import com.example.finalproject.exception.EntityAlreadyExistsException;
import com.example.finalproject.exception.EntityNotFoundException;

public interface CompanyService {

    Company create(Company company) throws EntityNotFoundException, EntityAlreadyExistsException;

    Company delete(String name) throws EntityNotFoundException;

    Company findByName(String name);
}
