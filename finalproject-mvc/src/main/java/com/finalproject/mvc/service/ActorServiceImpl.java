package com.finalproject.mvc.service;

import com.finalproject.mvc.entity.Actor;
import com.finalproject.mvc.repository.ActorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActorServiceImpl implements ActorService {

    @Autowired
    private ActorRepository actorRepository;

    @Override
    public Actor save(Actor actorToCreate) {
        Actor newActor;
        Actor actor = actorRepository.findByName(actorToCreate.getName());
        if (actor == null) {
            newActor = new Actor();
            newActor.setAge(actorToCreate.getAge());
            newActor.setEmail(actorToCreate.getEmail());
            newActor.setMovies(actorToCreate.getMovies());
            newActor.setName(actorToCreate.getName());

            actorRepository.save(newActor);
        } else {
            throw new RuntimeException("Actor already exists!");
        }
        return newActor;
    }
}
