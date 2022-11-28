package com.example.finalproject.services;

import com.example.finalproject.entities.Company;
import com.example.finalproject.exception.EntityAlreadyExistsException;
import com.example.finalproject.exception.EntityNotFoundException;
import com.example.finalproject.jparepositories.CompanyRepository;
import com.example.finalproject.messages.CompanyErrorMessages;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
@Slf4j
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    @Override
    public Company create(Company company) throws EntityAlreadyExistsException {
        Company companyFound = findByName(company.getName());
        if (companyFound != null) {
            log.error(CompanyErrorMessages.COMPANY_ALREADY_FOUND + " {}", company.getName());
            throw new EntityAlreadyExistsException(CompanyErrorMessages.COMPANY_ALREADY_FOUND + company.getName());
        }
        companyRepository.save(build(company));
        return company;
    }

    @Override
    public Company delete(String name) throws EntityNotFoundException {
        Company companyFound = findByName(name);
        if (companyFound == null) {
            log.error(CompanyErrorMessages.COMPANY_NOT_FOUND + " {}", name);
            throw new EntityNotFoundException(CompanyErrorMessages.COMPANY_NOT_FOUND + name);
        }
        companyRepository.delete(companyFound);
        return companyFound;
    }

    @Override
    public Company findByName(String name) {
        return companyRepository.findByName(name).orElse(null);
    }

    private Company build(Company company) {
        return Company.CompanyBuilder
                .aCompany()
                .withMovies(company.getMovies())
                .withName(company.getName())
                .build();
    }
}
