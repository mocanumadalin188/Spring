package com.example.finalproject.dtos.movies;

import com.example.finalproject.dtos.actors.ActorDTO;
import com.example.finalproject.dtos.companies.CompanyDTO;
import com.example.finalproject.dtos.soundtracks.SoundtrackDTO;
import com.example.finalproject.validation.movie.MovieDurationConstraint;

import java.util.HashSet;
import java.util.Set;

public class MovieUpdateDTO {

    private String type;

    private Set<ActorDTO> actors = new HashSet<>();

    private CompanyDTO company;

    private SoundtrackDTO soundtrack;

    @MovieDurationConstraint
    private int duration;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Set<ActorDTO> getActors() {
        return actors;
    }

    public void setActors(Set<ActorDTO> actors) {
        this.actors = actors;
    }

    public CompanyDTO getCompany() {
        return company;
    }

    public void setCompany(CompanyDTO company) {
        this.company = company;
    }

    public SoundtrackDTO getSoundtrack() {
        return soundtrack;
    }

    public void setSoundtrack(SoundtrackDTO soundtrack) {
        this.soundtrack = soundtrack;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
