package com.example.Exercise6;

import jakarta.validation.constraints.Email;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Ex6MyRunner implements CommandLineRunner {

    @Autowired
    private PersonProperties personProperties;

    @Value("${pl.sdacademy.zad6.first-name}")
    private String firstName;


    @Override
    public void run(String... args) throws Exception {
        log.info(firstName);
        log.info(personProperties.getLastName());
        log.info(personProperties.getAddress());
        log.info(personProperties.getEmail());
        log.info(String.valueOf(personProperties.getAge()));
        log.info(personProperties.getValues().toString());
        log.info(personProperties.getCustomAttributes().toString());

    }
}
