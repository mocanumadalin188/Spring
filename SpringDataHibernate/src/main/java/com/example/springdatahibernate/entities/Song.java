package com.example.springdatahibernate.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "SONG")
public class Song {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name", unique = true)
    private String name;

    @Column(name = "artist")
    private String artist;

    @ManyToMany(mappedBy = "songs")
    @JsonBackReference
    private Set<Soundtrack> soundtracks;

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

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public Set<Soundtrack> getSoundtracks() {
        return soundtracks;
    }

    public void setSoundtracks(Set<Soundtrack> soundtracks) {
        this.soundtracks = soundtracks;
    }
}
