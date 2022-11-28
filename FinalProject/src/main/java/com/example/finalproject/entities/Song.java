package com.example.finalproject.entities;

import javax.persistence.*;
import javax.validation.constraints.Pattern;
import java.util.HashSet;
import java.util.Set;

@Entity(name = "SONG")
public class Song {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name", unique = true, nullable = false)
    private String name;

    @Column(name = "artist")
    @Pattern(regexp = "^[A-Za-z]*$", message = "Invalid artist name")
    private String artist;

    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "songs")
    private Set<Soundtrack> soundtracks = new HashSet<>();

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
