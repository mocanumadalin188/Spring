package com.finalproject.mvc.controller.dto;

import java.util.HashSet;
import java.util.Set;

public class MovieDTO {

    private String name;
    private String type;
    private int duration;
    private Set<ActorDTO> actors = new HashSet<>();

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

    public Set<ActorDTO> getActors() {
        return actors;
    }

    public void setActors(Set<ActorDTO> actors) {
        this.actors = actors;
    }
}
