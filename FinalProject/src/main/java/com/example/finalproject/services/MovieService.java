package com.example.finalproject.services;

import com.example.finalproject.entities.Movie;
import com.example.finalproject.exception.EntityAlreadyExistsException;
import com.example.finalproject.exception.EntityNotFoundException;
import com.example.finalproject.request.MovieUpdate;

import java.util.List;

public interface MovieService {

    Movie create(Movie movie) throws EntityAlreadyExistsException;

    Movie update(MovieUpdate movie, String name) throws EntityNotFoundException;

    Movie delete(String name) throws EntityNotFoundException;

    Movie findByName(String name);

    List<Movie> findAll();

}
