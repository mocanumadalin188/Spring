package com.finalproject.mvc.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import javax.validation.constraints.Pattern;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "MOVIE", uniqueConstraints = @UniqueConstraint(columnNames = "name"))
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name", unique = true, nullable = false)
    private String name;

    @Column(name = "type")
    @Pattern(regexp = "^[A-Za-z]*$", message = "Invalid movie type")
    private String type;

    @Column(name = "duration")
    private int duration;

    @ManyToMany(cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinTable(
            name = "movie_actor",
            joinColumns = @JoinColumn(name = "movie_id"),
            inverseJoinColumns = @JoinColumn(name = "actor_id"))
    @JsonManagedReference
    private Set<Actor> actors = new HashSet<>();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Set<Actor> getActors() {
        return actors;
    }

    public void setActors(Set<Actor> actors) {
        this.actors = actors;
    }

    public static final class MovieBuilder {
        private long id;
        private @Pattern(regexp = "^[A-Za-z]*$", message = "Invalid name") String name;
        private @Pattern(regexp = "^[A-Za-z]*$", message = "Invalid movie type") String type;
        private int duration;
        private Set<Actor> actors;

        private MovieBuilder() {
        }

        public static MovieBuilder aMovie() {
            return new MovieBuilder();
        }

        public MovieBuilder withId(long id) {
            this.id = id;
            return this;
        }

        public MovieBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public MovieBuilder withType(String type) {
            this.type = type;
            return this;
        }

        public MovieBuilder withDuration(int duration) {
            this.duration = duration;
            return this;
        }

        public MovieBuilder withActors(Set<Actor> actors) {
            this.actors = actors;
            return this;
        }


        public Movie build() {
            Movie movie = new Movie();
            movie.setId(id);
            movie.setName(name);
            movie.setType(type);
            movie.setDuration(duration);
            movie.setActors(actors);
            return movie;
        }
    }
}