package com.example.springdatahibernate.controllers;

import com.example.springdatahibernate.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("movies")
public class MovieController {
    @Autowired
    private MovieService movieService;
//    @RequestMapping(method = RequestMethod.GET)
    @GetMapping("/moviesByActor/{name}")
    public ResponseEntity<?> findMoviesByActor(@PathVariable("name") String name){
        return new ResponseEntity<>(movieService.getMoviesBasedOnActor(name), HttpStatus.OK);

    }
}
