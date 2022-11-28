package com.example.finalproject.services;

import com.example.finalproject.entities.Song;
import com.example.finalproject.exception.EntityAlreadyExistsException;
import com.example.finalproject.exception.EntityNotFoundException;
import com.example.finalproject.jparepositories.SongRepository;
import com.example.finalproject.messages.SongErrorMessages;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
@Slf4j
public class SongServiceImpl implements SongService {

    @Autowired
    private SongRepository songRepository;

    @Override
    public Song create(Song song) throws EntityAlreadyExistsException {
        Song foundSong = findByName(song.getName());
        if (foundSong != null) {
            log.error(SongErrorMessages.SONG_ALREADY_FOUND + " {}", song.getName());
            throw new EntityAlreadyExistsException(SongErrorMessages.SONG_ALREADY_FOUND + song.getName());
        }
        songRepository.save(song);
        return song;
    }

    @Override
    public Song delete(String name) throws EntityNotFoundException {
        Song foundSong = findByName(name);
        if (foundSong == null) {
            log.error(SongErrorMessages.SONG_NOT_FOUND + " {}", name);
            throw new EntityNotFoundException(SongErrorMessages.SONG_NOT_FOUND + name);
        }
        songRepository.delete(foundSong);
        return foundSong;
    }

    @Override
    public Song findByName(String name) {
        return songRepository.findByName(name).orElse(null);
    }
}
