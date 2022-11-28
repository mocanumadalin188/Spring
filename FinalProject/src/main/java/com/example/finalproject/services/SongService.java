package com.example.finalproject.services;

import com.example.finalproject.entities.Song;
import com.example.finalproject.exception.EntityAlreadyExistsException;
import com.example.finalproject.exception.EntityNotFoundException;

public interface SongService {

    Song create(Song song) throws EntityAlreadyExistsException;

    Song delete(String name) throws EntityNotFoundException;

    Song findByName(String name);
}
