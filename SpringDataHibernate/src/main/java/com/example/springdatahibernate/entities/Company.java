package com.example.springdatahibernate.entities;

import javax.persistence.*;
import java.util.List;

@Entity(name = "COMPANY")
@Table(uniqueConstraints = {@UniqueConstraint(columnNames = {"name"})})
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "name", unique = true)
    private String name;
    @OneToMany(mappedBy = "company")
    private List<Movie> movies;

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

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }
}
