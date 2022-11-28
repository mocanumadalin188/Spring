package com.example.springdatahibernate.jparepositories;

import com.example.springdatahibernate.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {
    // TODO @query
    // TODO complex queries with jpa
    // TODO CRUD operations
}
