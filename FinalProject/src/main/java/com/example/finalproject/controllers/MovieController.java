package com.example.finalproject.controllers;

import com.example.finalproject.dtos.movies.MovieDTO;
import com.example.finalproject.dtos.movies.MovieUpdateDTO;
import com.example.finalproject.exception.EntityAlreadyExistsException;
import com.example.finalproject.exception.EntityNotFoundException;
import com.example.finalproject.mappers.GenericMapper;
import com.example.finalproject.services.MovieService;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("movies")
@Validated
public class MovieController {

    @Autowired
    private MovieService movieService;
    private final GenericMapper mapper = Mappers.getMapper(GenericMapper.class);

    @PostMapping
    public ResponseEntity<?> create(@Valid @RequestBody MovieDTO movieDTO) throws EntityAlreadyExistsException {
        return new ResponseEntity<>(mapper.movieToMovieDTO(movieService.create(mapper.movieDTOToMovie(movieDTO))), HttpStatus.OK);
    }

    @PutMapping("/{name}")
    public ResponseEntity<?> update(@Valid @RequestBody MovieUpdateDTO movieUpdateDTO, @PathVariable("name") String name) throws EntityNotFoundException {
        return new ResponseEntity<>(mapper.movieToMovieDTO(movieService.update(mapper.movieUpdateDTOToMovieUpdate(movieUpdateDTO), name)), HttpStatus.OK);
    }

    @DeleteMapping("/{name}")
    public ResponseEntity<?> delete(@PathVariable("name") String name) throws EntityNotFoundException {
        return new ResponseEntity<>(mapper.movieToMovieDTO(movieService.delete(name)), HttpStatus.OK);
    }

}
