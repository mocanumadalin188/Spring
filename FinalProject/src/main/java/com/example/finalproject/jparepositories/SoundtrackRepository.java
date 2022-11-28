package com.example.finalproject.jparepositories;

import com.example.finalproject.entities.Soundtrack;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SoundtrackRepository extends JpaRepository<Soundtrack, Long> {

    Optional<Soundtrack> findByName(String name);
}
