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
}
