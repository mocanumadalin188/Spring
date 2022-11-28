package com.example.springdatahibernate.simplerepository;

import com.example.springdatahibernate.entities.Actor;

import java.util.List;

public interface ActorSimpleRepository {

    Actor findById(long id);

    Actor save(Actor actor);

    List<Actor> save(List<Actor> actor);

    Actor updateById(long id);

    List<Actor> findAll();

    Actor deleteById(long id);

    // TODO implement CRUD operations (add necessary methods and implementations) for the other repositories
}
