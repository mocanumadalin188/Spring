package com.example.finalproject.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity(name = "COMPANY")
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "name", unique = true, nullable = false)
    private String name;
    @OneToMany(mappedBy = "company")
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

    public Set<Movie> getMovies() {
        return movies;
    }

    public void setMovies(Set<Movie> movies) {
        this.movies = movies;
    }

    public static final class CompanyBuilder {
        private long id;
        private String name;
        private Set<Movie> movies;

        private CompanyBuilder() {
        }

        public static CompanyBuilder aCompany() {
            return new CompanyBuilder();
        }

        public CompanyBuilder withId(long id) {
            this.id = id;
            return this;
        }

        public CompanyBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public CompanyBuilder withMovies(Set<Movie> movies) {
            this.movies = movies;
            return this;
        }

        public Company build() {
            Company company = new Company();
            company.setId(id);
            company.setName(name);
            company.setMovies(movies);
            return company;
        }
    }
}
