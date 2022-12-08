package com.example.springdatahibernate.runners;

import com.example.springdatahibernate.entities.Actor;
import com.example.springdatahibernate.entities.Company;
import com.example.springdatahibernate.entities.Movie;
import com.example.springdatahibernate.entities.Soundtrack;
import com.example.springdatahibernate.services.CompanyService;
import com.example.springdatahibernate.services.MovieService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
@Slf4j
public class DBPopulationRunner implements CommandLineRunner {

    @Autowired
    private MovieService movieService;

    @Autowired
    private CompanyService companyService;

    @Override
    public void run(String... args) throws Exception {
//        Movie movie = new Movie();
//
//        Company companyToBeFound = companyService.findByName("Compania noastra 2");
//
//        Actor actor1 = new Actor();
//        actor1.setName("Dana");
//        actor1.setAge("37");
//
//        Actor actor2 = new Actor();
//        actor2.setName("Mara");
//        actor2.setAge("55");
//
//        Actor actor3 = new Actor();
//        actor3.setName("Geani");
//        actor3.setAge("64");
//
//        Set<Actor> actorSet = new HashSet<>();
//        actorSet.add(actor1);
//        actorSet.add(actor2);
//        actorSet.add(actor3);
//
//        movie.setName("Invizibilii");
//        movie.setType("Istoric");
//        movie.setCompany(companyToBeFound);
//        movie.setActors(actorSet);
//
//        Soundtrack soundtrack = new Soundtrack();
//        soundtrack.setName("Muzica Atomic");
//        soundtrack.setMovie(movie);
//        soundtrack.setSongs(null);
//
//        movie.setSoundtrack(soundtrack);
//
//        movieService.save(movie);

        // Toate movie-urile care contin in nume "mor" si sunt ordonate crescator dupa nume

        movieService.getMoviesBasedOnActor("Alex").forEach(movie -> log.info(movie.getName()));

        movieService.getMovieThatContainsSomethingAndSortAsc("ii").forEach(movie -> log.info(movie.getName()));

        movieService.getMoviesBasedOnActor2("Alex").forEach(name -> log.info(name));

    }
}
