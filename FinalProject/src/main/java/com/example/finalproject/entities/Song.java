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

    public static final class SongBuilder {
        private long id;
        private String name;
        private @Pattern(regexp = "^[A-Za-z]*$", message = "Invalid artist name") String artist;
        private Set<Soundtrack> soundtracks;

        private SongBuilder() {
        }

        public static SongBuilder aSong() {
            return new SongBuilder();
        }

        public SongBuilder withId(long id) {
            this.id = id;
            return this;
        }

        public SongBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public SongBuilder withArtist(String artist) {
            this.artist = artist;
            return this;
        }

        public SongBuilder withSoundtracks(Set<Soundtrack> soundtracks) {
            this.soundtracks = soundtracks;
            return this;
        }

        public Song build() {
            Song song = new Song();
            song.setId(id);
            song.setName(name);
            song.setArtist(artist);
            song.setSoundtracks(soundtracks);
            return song;
        }
    }
}
