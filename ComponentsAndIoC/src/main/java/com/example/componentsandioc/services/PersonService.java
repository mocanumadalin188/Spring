package com.example.componentsandioc.services;

import com.example.componentsandioc.components.Adolescent;
import com.example.componentsandioc.components.Employable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class PersonService implements CommandLineRunner {
    private Adolescent adolescent;

    @Autowired
    @Qualifier("adult")
    private Employable employable;

    @Autowired
    public void setAdolescent(Adolescent adolescent) {
        this.adolescent = adolescent;
    }

    @Override
    public void run(String... args) throws Exception {
//        adolescent.study();
//        employable.employ();
    }
}
