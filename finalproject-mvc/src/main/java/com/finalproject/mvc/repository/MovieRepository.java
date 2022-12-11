package com.finalproject.mvc.repository;

import com.finalproject.mvc.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {
    Movie findByName(String name);
}
