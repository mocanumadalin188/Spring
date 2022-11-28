package com.example.finalproject.services;

import com.example.finalproject.entities.Actor;
import com.example.finalproject.exception.EntityAlreadyExistsException;
import com.example.finalproject.exception.EntityNotFoundException;
import com.example.finalproject.jparepositories.ActorRepository;
import com.example.finalproject.messages.ActorErrorMessages;
import com.example.finalproject.request.ActorUpdate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
@Slf4j
public class ActorServiceImpl implements ActorService {

    @Autowired
    private ActorRepository actorRepository;

    @Override
    public Actor create(Actor actor) throws EntityAlreadyExistsException {
        Actor foundActor = findByEmail(actor.getEmail());
        if (foundActor != null) {
            log.error(ActorErrorMessages.ACTOR_ALREADY_FOUND + " {}", actor.getEmail());
            throw new EntityAlreadyExistsException(ActorErrorMessages.ACTOR_ALREADY_FOUND + actor.getEmail());
        }
        actorRepository.save(actor);
        return actor;
    }

    @Override
    public Actor update(ActorUpdate actorUpdate, String email) throws EntityNotFoundException, EntityAlreadyExistsException {
        Actor foundActor = findByEmail(email);
        if (foundActor == null) {
            log.error(ActorErrorMessages.ACTOR_NOT_FOUND + " {}", email);
            throw new EntityNotFoundException(ActorErrorMessages.ACTOR_NOT_FOUND + email);
        }
        foundActor.setMovies(actorUpdate.getMovies());
        actorRepository.save(foundActor);
        return foundActor;
    }

    @Override
    public Actor delete(String email) throws EntityNotFoundException {
        Actor foundActor = findByEmail(email);
        if (foundActor == null) {
            log.error(ActorErrorMessages.ACTOR_NOT_FOUND + " {}", email);
            throw new EntityNotFoundException(ActorErrorMessages.ACTOR_NOT_FOUND + email);
        }
        actorRepository.delete(foundActor);
        return foundActor;
    }

    @Override
    public Actor findByEmail(String email) {
        return actorRepository.findByEmail(email).orElse(null);
    }

    @Override
    public List<Actor> findAll() {
        return actorRepository.findAll();
    }

    @Override
    public List<Actor> findActorsWithMinimumMoviesPlayed(int nrOfMovies) {
        List<Actor> actors = findAll();

        return actors.stream().filter(a -> a.getMovies().size() >= nrOfMovies).collect(Collectors.toList());
    }
}
