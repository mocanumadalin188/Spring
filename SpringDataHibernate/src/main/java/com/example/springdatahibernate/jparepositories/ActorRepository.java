package com.example.springdatahibernate.jparepositories;

import com.example.springdatahibernate.entities.Actor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActorRepository extends JpaRepository<Actor, Long> {
}
