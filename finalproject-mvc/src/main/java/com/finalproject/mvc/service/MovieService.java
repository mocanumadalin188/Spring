package com.finalproject.mvc.service;

import com.finalproject.mvc.entity.Movie;

import java.util.List;

public interface MovieService {
    List<Movie> findAll();

    Movie save(Movie movieToCreate);
}
