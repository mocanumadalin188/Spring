package com.example.springdatahibernate.jparepositories;

import com.example.springdatahibernate.entities.Actor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ActorRepository extends JpaRepository<Actor, Long> {

    @Query(value = "select a.name from ACTOR a where a.name in :uuids")
    List<String> getNames(@Param("uuids") List<String> uuids);
}
