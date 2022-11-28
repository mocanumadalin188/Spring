package com.example.finalproject.dtos.soundtracks;

import com.example.finalproject.dtos.movies.MovieDTO;
import com.example.finalproject.dtos.songs.SongDTO;

import java.util.HashSet;
import java.util.Set;

public class SoundtrackUpdateDTO {
    private MovieDTO movie;
    private Set<SongDTO> songs = new HashSet<>();

    public MovieDTO getMovie() {
        return movie;
    }

    public void setMovie(MovieDTO movie) {
        this.movie = movie;
    }

    public Set<SongDTO> getSongs() {
        return songs;
    }

    public void setSongs(Set<SongDTO> songs) {
        this.songs = songs;
    }
}
