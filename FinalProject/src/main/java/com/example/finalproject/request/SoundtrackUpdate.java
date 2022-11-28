package com.example.finalproject.request;

import com.example.finalproject.entities.Movie;
import com.example.finalproject.entities.Song;

import java.util.HashSet;
import java.util.Set;

public class SoundtrackUpdate {

    private Movie movie;

    private Set<Song> songs = new HashSet<>();

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
}
