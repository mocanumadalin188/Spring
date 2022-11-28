package com.example.finalproject.services;

import com.example.finalproject.entities.Movie;
import com.example.finalproject.exception.EntityAlreadyExistsException;
import com.example.finalproject.exception.EntityNotFoundException;
import com.example.finalproject.jparepositories.MovieRepository;
import com.example.finalproject.messages.MovieErrorMessages;
import com.example.finalproject.request.MovieUpdate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
@Slf4j
public class MovieServiceImpl implements MovieService {

    @Autowired
    private MovieRepository movieRepository;

    @Override
    public Movie create(Movie movie) throws EntityAlreadyExistsException {
        Movie foundMovie = findByName(movie.getName());
        if (foundMovie != null) {
            log.error(MovieErrorMessages.MOVIE_ALREADY_FOUND + " {}", movie.getName());
            throw new EntityAlreadyExistsException(MovieErrorMessages.MOVIE_ALREADY_FOUND + movie.getName());
        }
        movieRepository.save(build(movie));
        return movie;
    }

    @Override
    public Movie update(MovieUpdate movie, String name) throws EntityNotFoundException {
        Movie foundMovie = findByName(name);
        if (foundMovie == null) {
            log.error(MovieErrorMessages.MOVIE_NOT_FOUND + " {}", name);
            throw new EntityNotFoundException(MovieErrorMessages.MOVIE_NOT_FOUND + name);
        }
        foundMovie.setCompany(movie.getCompany());
        foundMovie.setType(movie.getType());
        foundMovie.setSoundtrack(movie.getSoundtrack());

        return foundMovie;
    }

    @Override
    public Movie delete(String name) throws EntityNotFoundException {
        Movie foundMovie = findByName(name);
        if (foundMovie == null) {
            log.error(MovieErrorMessages.MOVIE_NOT_FOUND + " {}", name);
            throw new EntityNotFoundException(MovieErrorMessages.MOVIE_NOT_FOUND + name);
        }
        movieRepository.delete(foundMovie);
        return foundMovie;
    }

    @Override
    public Movie findByName(String name) {
        return movieRepository.findByName(name).orElse(null);
    }


    @Override
    public List<Movie> findAll() {
        return movieRepository.findAll();
    }

    private Movie build(Movie movie) {
        return Movie.MovieBuilder
                .aMovie()
                .withName(movie.getName())
                .withActors(movie.getActors())
                .withType(movie.getType())
                .withDuration(movie.getDuration())
                .withSoundtrack(movie.getSoundtrack())
                .withCompany(movie.getCompany())
                .build();
    }
}
