package com.example.finalproject.dtos.companies;

import com.example.finalproject.dtos.movies.MovieDTO;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

public class CompanyDTO {
    @NotNull
    @NotEmpty
    private String name;
    private Set<MovieDTO> movies = new HashSet<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<MovieDTO> getMovies() {
        return movies;
    }

    public void setMovies(Set<MovieDTO> movies) {
        this.movies = movies;
    }
}
