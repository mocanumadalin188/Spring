package com.example.finalproject.services;

import com.example.finalproject.entities.Soundtrack;
import com.example.finalproject.exception.EntityAlreadyExistsException;
import com.example.finalproject.exception.EntityNotFoundException;
import com.example.finalproject.request.SoundtrackUpdate;

public interface SoundtrackService {
    Soundtrack create(Soundtrack soundtrack) throws EntityAlreadyExistsException;

    Soundtrack update(SoundtrackUpdate soundtrack, String name) throws EntityNotFoundException;

    Soundtrack delete(String name) throws EntityNotFoundException;

    Soundtrack findByName(String name);
}
