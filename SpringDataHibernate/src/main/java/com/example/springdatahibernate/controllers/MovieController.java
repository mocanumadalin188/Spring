package com.example.springdatahibernate.controllers;

import com.example.springdatahibernate.services.MovieService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("movies")
public class MovieController {

//    ObjectMapper objectMapper - prin acest objectMapper se face serializarea și de-serializarea
//    între obiecte (fișiere Java) și Json-uri (fișiere Json)
    @Autowired
    private MovieService movieService;
//    @RequestMapping(method = RequestMethod.GET)
    @GetMapping("/moviesByActor/{name}")
    public ResponseEntity<?> findMoviesByActor(@PathVariable("name") String name){
        return new ResponseEntity<>(movieService.getMoviesBasedOnActor(name), HttpStatus.OK);

    }
}
