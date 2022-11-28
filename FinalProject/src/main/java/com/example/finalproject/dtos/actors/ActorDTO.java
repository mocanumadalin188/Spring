package com.example.finalproject.dtos.actors;

import com.example.finalproject.dtos.movies.MovieDTO;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

public class ActorDTO {
    @NotNull
    @NotEmpty
    private String name;
    private int age;
    @NotNull
    @NotEmpty
    private String email;
    private Set<MovieDTO> movies = new HashSet<>();

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

    public Set<MovieDTO> getMovies() {
        return movies;
    }

    public void setMovies(Set<MovieDTO> movies) {
        this.movies = movies;
    }
}
