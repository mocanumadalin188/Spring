package com.example.finalproject.entities;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import java.util.HashSet;
import java.util.Set;

@Entity(name = "ACTOR")
public class Actor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "name", nullable = false)
    @Pattern(regexp = "^[A-Za-z]*$", message = "Invalid actor name")
    private String name;
    @Column(name = "age")
    @Min(1)
    @Max(100)
    private int age;
    @Column(name = "email", unique = true, nullable = false)
    @Email
    private String email;
    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "actors")
    private Set<Movie> movies = new HashSet<>();

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<Movie> getMovies() {
        return movies;
    }

    public void setMovies(Set<Movie> movies) {
        this.movies = movies;
    }

    public static final class ActorBuilder {
        private long id;
        private @Pattern(regexp = "^[A-Za-z]*$", message = "Invalid actor name") String name;
        private @Min(1) @Max(100) int age;
        private @Email String email;
        private Set<Movie> movies;

        private ActorBuilder() {
        }

        public static ActorBuilder anActor() {
            return new ActorBuilder();
        }

        public ActorBuilder withId(long id) {
            this.id = id;
            return this;
        }

        public ActorBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public ActorBuilder withAge(int age) {
            this.age = age;
            return this;
        }

        public ActorBuilder withEmail(String email) {
            this.email = email;
            return this;
        }

        public ActorBuilder withMovies(Set<Movie> movies) {
            this.movies = movies;
            return this;
        }

        public Actor build() {
            Actor actor = new Actor();
            actor.setId(id);
            actor.setName(name);
            actor.setAge(age);
            actor.setEmail(email);
            actor.setMovies(movies);
            return actor;
        }
    }
}
