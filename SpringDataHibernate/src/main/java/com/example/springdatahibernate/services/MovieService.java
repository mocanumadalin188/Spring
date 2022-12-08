package com.example.springdatahibernate.services;

import com.example.springdatahibernate.entities.Movie;

import java.util.List;

public interface MovieService {
    Movie save(Movie movie);

    List<Movie> getMoviesBasedOnActor(String name);

    List<Movie> getMovieThatContainsSomethingAndSortAsc(String name);

    List<String> getMoviesBasedOnActor2(String name);
}
