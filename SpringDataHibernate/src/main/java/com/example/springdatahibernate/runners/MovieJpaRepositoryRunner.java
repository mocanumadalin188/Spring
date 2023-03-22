package com.example.springdatahibernate.runners;

import com.example.springdatahibernate.jparepositories.ActorRepository;
import com.example.springdatahibernate.services.MovieService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
@Slf4j
public class MovieJpaRepositoryRunner implements CommandLineRunner {

    @Autowired
    private MovieService movieService;

    @Autowired
    private ActorRepository actorRepository;

    @Override
    public void run(String... args) throws Exception {
        List<String> strings = Arrays.asList("abc", "abd", "bbb");
        log.info("strings : {}", strings);
        System.out.println(actorRepository.getNames(strings));
    }
}
