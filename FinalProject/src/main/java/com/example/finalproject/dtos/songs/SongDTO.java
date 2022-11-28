package com.example.finalproject.dtos.songs;

import com.example.finalproject.dtos.soundtracks.SoundtrackDTO;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

public class SongDTO {
    @NotNull
    @NotEmpty
    private String name;
    private String artist;
    private Set<SoundtrackDTO> soundtracks = new HashSet<>();

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

    public Set<SoundtrackDTO> getSoundtracks() {
        return soundtracks;
    }

    public void setSoundtracks(Set<SoundtrackDTO> soundtracks) {
        this.soundtracks = soundtracks;
    }
}
