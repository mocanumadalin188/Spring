package com.example.springdatahibernate.jparepositories;

import com.example.springdatahibernate.entities.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {
}
