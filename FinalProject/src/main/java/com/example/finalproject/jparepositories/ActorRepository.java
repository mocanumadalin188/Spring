package com.example.finalproject.jparepositories;

import com.example.finalproject.entities.Actor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ActorRepository extends JpaRepository<Actor, Long> {
    Optional<Actor> findByEmail(String email);
}
