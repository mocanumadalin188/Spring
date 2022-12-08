package com.example.springdatahibernate.jparepositories;

import com.example.springdatahibernate.entities.Company;
import com.example.springdatahibernate.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface MovieRepository extends JpaRepository<Movie, Long> {
    Optional<Movie> findByName(String name);
    List<Movie> findAllByType(String type);

    @Query(value = "SELECT m from MOVIE m JOIN m.actors act WHERE act.name = ?1")
    List<Movie> getMoviesBasedOnActor (@Param("actorName") String actorName);

    List<Movie> findMoviesByNameContainsIgnoreCaseOrderByNameAsc (String name);

    @Query(value = "select  e.name from actor as c inner join movie_actor as d\n" +
            "on c.id=d.actor_id\n" +
            "inner join movie as e\n" +
            "on d.movie_id=e.id where c.name = ?1", nativeQuery = true)
    List<String> getMoviesBasedOnActor2 (@Param("actorName") String actorName);
}
