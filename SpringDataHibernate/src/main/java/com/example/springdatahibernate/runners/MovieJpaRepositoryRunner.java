package com.example.springdatahibernate.runners;

import com.example.springdatahibernate.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MovieJpaRepositoryRunner implements CommandLineRunner {

    @Autowired
    private MovieService movieService;

    @Override
    public void run(String... args) throws Exception {
        // TODO if we run with "create" , we create
        // TODO if we run with "update" , we update
    }
}
