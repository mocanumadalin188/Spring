package com.example.finalproject.controllers;

import com.example.finalproject.dtos.companies.CompanyDTO;
import com.example.finalproject.exception.EntityAlreadyExistsException;
import com.example.finalproject.exception.EntityNotFoundException;
import com.example.finalproject.mappers.GenericMapper;
import com.example.finalproject.services.CompanyService;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("companies")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    private final GenericMapper mapper = Mappers.getMapper(GenericMapper.class);

    @PostMapping
    public ResponseEntity<?> create(@RequestBody CompanyDTO companyDTO) throws EntityAlreadyExistsException, EntityNotFoundException {
        return new ResponseEntity<>(mapper.companyToCompanyDTO(companyService.create(mapper.companyDTOToCompany(companyDTO))), HttpStatus.OK);
    }

    @DeleteMapping("/{name}")
    public ResponseEntity<?> delete(@PathVariable("name") String name) throws EntityNotFoundException {
        return new ResponseEntity<>(mapper.companyToCompanyDTO(companyService.delete(name)), HttpStatus.OK);
    }
}
