package com.example.springdatahibernate.services;

import com.example.springdatahibernate.entities.Movie;
import com.example.springdatahibernate.jparepositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class MovieServiceImpl implements MovieService {

    @Autowired
    private MovieRepository movieRepository;

    @Override
    public Movie save(Movie movie) {
        return null; /// aici am ramasss si merge
    }
}
