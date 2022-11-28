package com.example.finalproject.dtos.soundtracks;

import com.example.finalproject.dtos.movies.MovieDTO;
import com.example.finalproject.dtos.songs.SongDTO;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

public class SoundtrackDTO {
    @NotNull
    @NotEmpty
    private String name;

    private MovieDTO movie;

    private Set<SongDTO> songs = new HashSet<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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
