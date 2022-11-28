package com.example.springdatahibernate.simplerepository;

import com.example.springdatahibernate.entities.Actor;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;
import java.util.List;

@Component
public class ActorSimpleRepositoryImpl implements ActorSimpleRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Actor findById(long id) {
        return entityManager.find(Actor.class, id);
    }

    @Override
    public Actor save(Actor actor) {
        try {
            EntityTransaction entityTransaction = entityManager.getTransaction();
            if (!entityTransaction.isActive()) {
                entityTransaction.begin();
            }
            // TODO explain flush()
            // set a property on actor , actor is managed by the persistence context , it will be inserted with the new property
            entityManager.persist(actor);
            entityTransaction.commit();
            return actor;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<Actor> save(List<Actor> actors) {
        try {
            EntityTransaction entityTransaction = entityManager.getTransaction();
            if (!entityTransaction.isActive()) {
                entityTransaction.begin();
            }
            for (Actor actor : actors) {
                entityManager.persist(actor);
            }
            entityTransaction.commit();
            return actors;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Actor updateById(long id) {
        try {
            Actor actor = findById(id);
            EntityTransaction entityTransaction = entityManager.getTransaction();
            if (!entityTransaction.isActive()) {
                entityTransaction.begin();
            }
            actor.setName(actor.getName());
            entityManager.merge(actor);
            // set a property on actor , actor(parameter) is not managed by the persistence context , therefore not updated.
            // if we return it, it is used by persistence context, so we can update afterwards
            entityTransaction.commit();
            return actor;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<Actor> findAll() {
        return entityManager.createQuery("FROM actor", Actor.class).getResultList();
    }

    @Override
    public Actor deleteById(long id) {
        try {
            Actor actor = entityManager.find(Actor.class, id);
            EntityTransaction entityTransaction = entityManager.getTransaction();
            if (!entityTransaction.isActive()) {
                entityTransaction.begin();
            }
            entityManager.remove(actor);
            entityTransaction.commit();
            return actor;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
