package com.example.finalproject.services;

import com.example.finalproject.entities.Actor;
import com.example.finalproject.exception.EntityAlreadyExistsException;
import com.example.finalproject.exception.EntityNotFoundException;
import com.example.finalproject.request.ActorUpdate;

import java.util.List;

public interface ActorService {

    Actor create(Actor actor) throws EntityAlreadyExistsException;

    Actor update(ActorUpdate actorUpdate, String email) throws EntityNotFoundException, EntityAlreadyExistsException;

    Actor delete(String email) throws EntityNotFoundException;

    Actor findByEmail(String email);

    List<Actor> findAll();

    List<Actor> findActorsWithMinimumMoviesPlayed(int nrOfMovies);
}
