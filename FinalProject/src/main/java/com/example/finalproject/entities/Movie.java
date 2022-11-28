package com.example.finalproject.entities;

import com.example.finalproject.validation.movie.MovieDurationConstraint;

import javax.persistence.*;
import javax.validation.constraints.Pattern;
import java.util.HashSet;
import java.util.Set;

@Entity(name = "MOVIE")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name", unique = true, nullable = false)
    @Pattern(regexp = "^[A-Za-z]*$", message = "Invalid name")
    private String name;

    @Column(name = "type")
    @Pattern(regexp = "^[A-Za-z]*$", message = "Invalid movie type")
    private String type;

    @Column(name = "duration")
    @MovieDurationConstraint
    private int duration;

    @ManyToMany
    @JoinTable(
            name = "movie_actor",
            joinColumns = @JoinColumn(name = "movie_id"),
            inverseJoinColumns = @JoinColumn(name = "actor_id"))
    private Set<Actor> actors = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "company_id", nullable = false)
    private Company company;

    @OneToOne(mappedBy = "movie", cascade = CascadeType.ALL, fetch = FetchType.LAZY, optional = false)
    private Soundtrack soundtrack;

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

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Soundtrack getSoundtrack() {
        return soundtrack;
    }

    public void setSoundtrack(Soundtrack soundtrack) {
        this.soundtrack = soundtrack;
    }


    public static final class MovieBuilder {
        private long id;
        private @Pattern(regexp = "^[A-Za-z]*$", message = "Invalid name") String name;
        private @Pattern(regexp = "^[A-Za-z]*$", message = "Invalid movie type") String type;
        private int duration;
        private Set<Actor> actors;
        private Company company;
        private Soundtrack soundtrack;

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

        public MovieBuilder withCompany(Company company) {
            this.company = company;
            return this;
        }

        public MovieBuilder withSoundtrack(Soundtrack soundtrack) {
            this.soundtrack = soundtrack;
            return this;
        }

        public Movie build() {
            Movie movie = new Movie();
            movie.setId(id);
            movie.setName(name);
            movie.setType(type);
            movie.setDuration(duration);
            movie.setActors(actors);
            movie.setCompany(company);
            movie.setSoundtrack(soundtrack);
            return movie;
        }
    }
}
