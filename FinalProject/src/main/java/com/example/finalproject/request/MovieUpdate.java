package com.example.finalproject.request;

import com.example.finalproject.entities.Actor;
import com.example.finalproject.entities.Company;
import com.example.finalproject.entities.Soundtrack;

import java.util.HashSet;
import java.util.Set;

public class MovieUpdate {

    private String type;

    private Set<Actor> actors = new HashSet<>();

    private Company company;

    private Soundtrack soundtrack;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
}
