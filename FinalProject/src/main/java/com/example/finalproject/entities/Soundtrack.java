package com.example.finalproject.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity(name = "SOUNDTRACK")
public class Soundtrack {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name", unique = true, nullable = false)
    private String name;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "movie_id")
    private Movie movie;

    @ManyToMany
    @JoinTable(
            name = "soundtrack_song",
            joinColumns = @JoinColumn(name = "soundtrack_id"),
            inverseJoinColumns = @JoinColumn(name = "song_id"))
    private Set<Song> songs = new HashSet<>();

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

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Set<Song> getSongs() {
        return songs;
    }

    public void setSongs(Set<Song> songs) {
        this.songs = songs;
    }


    public static final class SoundtrackBuilder {
        private long id;
        private String name;
        private Movie movie;
        private Set<Song> songs;

        private SoundtrackBuilder() {
        }

        public static SoundtrackBuilder aSoundtrack() {
            return new SoundtrackBuilder();
        }

        public SoundtrackBuilder withId(long id) {
            this.id = id;
            return this;
        }

        public SoundtrackBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public SoundtrackBuilder withMovie(Movie movie) {
            this.movie = movie;
            return this;
        }

        public SoundtrackBuilder withSongs(Set<Song> songs) {
            this.songs = songs;
            return this;
        }

        public Soundtrack build() {
            Soundtrack soundtrack = new Soundtrack();
            soundtrack.setId(id);
            soundtrack.setName(name);
            soundtrack.setMovie(movie);
            soundtrack.setSongs(songs);
            return soundtrack;
        }
    }
}
