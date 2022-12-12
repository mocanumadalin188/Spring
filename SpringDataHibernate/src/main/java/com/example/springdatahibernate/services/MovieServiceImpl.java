package com.example.springdatahibernate.services;

import com.example.springdatahibernate.entities.Movie;
import com.example.springdatahibernate.exceptions.AlreadyExistsException;
import com.example.springdatahibernate.jparepositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class MovieServiceImpl implements MovieService {

    @Autowired
    private MovieRepository movieRepository;

    @Override
    public Movie save(Movie movie) {
        Movie movieToBeSaved = movieRepository.findByName(movie.getName()).orElse(null);
        if(movieToBeSaved==null){   // cand e egal cu null inseamna ca nu exista in baza de date
            movieRepository.save(movie); // intra in if si il salveaza ^
        } else {
            throw new AlreadyExistsException("Movie cannot be saved as it already exists!");
        }
        return movie;
    }

    @Override
    public List<Movie> getMoviesBasedOnActor(String name) {
        return movieRepository.getMoviesBasedOnActor(name);
    }

    @Override
    public List<Movie> getMovieThatContainsSomethingAndSortAsc(String name) {
        return movieRepository.findMoviesByNameContainsIgnoreCaseOrderByNameAsc(name);
    }

    @Override
    public List<String> getMoviesBasedOnActor2(String name) {
        return movieRepository.getMoviesBasedOnActor2(name);
    }


}
