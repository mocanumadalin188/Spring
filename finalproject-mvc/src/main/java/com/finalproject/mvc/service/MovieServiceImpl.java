package com.finalproject.mvc.service;

import com.finalproject.mvc.entity.Movie;
import com.finalproject.mvc.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    private MovieRepository movieRepository;

    @Override
    public List<Movie> findAll() {
        return movieRepository.findAll();
    }

    @Override
    public Movie save(Movie movieToCreate) {
        Movie newMovie;
        Movie movie = movieRepository.findByName(movieToCreate.getName());
        if (movie == null) {
            newMovie = new Movie();

            newMovie.setDuration(movieToCreate.getDuration());
            newMovie.setType(movieToCreate.getType());
            newMovie.setName(movieToCreate.getName());
            newMovie.setActors(movieToCreate.getActors());

            movieRepository.save(newMovie);
        } else {
            throw new RuntimeException("Movie already exists");
        }

        return newMovie;
    }
}
