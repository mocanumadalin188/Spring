package com.example.springdatahibernate.jparepositories;

import com.example.springdatahibernate.entities.Soundtrack;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SoundtrackRepository extends JpaRepository<Soundtrack, Long> {
}
