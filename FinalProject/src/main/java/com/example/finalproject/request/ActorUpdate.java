package com.example.finalproject.request;

import com.example.finalproject.entities.Movie;

import java.util.HashSet;
import java.util.Set;

public class ActorUpdate {

    private String name;
    private int age;
    private Set<Movie> movies = new HashSet<>();

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

    public Set<Movie> getMovies() {
        return movies;
    }

    public void setMovies(Set<Movie> movies) {
        this.movies = movies;
    }
}
