package com.example.jdbc.runner;

import com.example.jdbc.dao.PersonDAO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class PersonCRUDRunner implements CommandLineRunner {

    @Autowired
    private PersonDAO personDAO;

    @Override
    public void run(String... args) {
//        personDAO.getAll().forEach(a -> log.info(a.getFirstName()));
    }
}
