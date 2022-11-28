package com.example.finalproject.services;

import com.example.finalproject.entities.Soundtrack;
import com.example.finalproject.exception.EntityAlreadyExistsException;
import com.example.finalproject.exception.EntityNotFoundException;
import com.example.finalproject.jparepositories.SoundtrackRepository;
import com.example.finalproject.messages.SoundtrackErrorMessages;
import com.example.finalproject.request.SoundtrackUpdate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
@Slf4j
public class SoundtrackServiceImpl implements SoundtrackService {

    @Autowired
    private SoundtrackRepository soundtrackRepository;

    @Override
    public Soundtrack create(Soundtrack soundtrack) throws EntityAlreadyExistsException {
        Soundtrack foundSoundtrack = findByName(soundtrack.getName());
        if (foundSoundtrack != null) {
            log.error(SoundtrackErrorMessages.SOUNDTRACK_ALREADY_FOUND + " {}", soundtrack.getName());
            throw new EntityAlreadyExistsException(SoundtrackErrorMessages.SOUNDTRACK_ALREADY_FOUND + soundtrack.getName());
        }
        soundtrackRepository.save(build(soundtrack));
        return soundtrack;
    }

    @Override
    public Soundtrack update(SoundtrackUpdate soundtrack, String name) throws EntityNotFoundException {
        Soundtrack foundSoundtrack = findByName(name);
        if (foundSoundtrack == null) {
            log.error(SoundtrackErrorMessages.SOUNDTRACK_NOT_FOUND + " {}", name);
            throw new EntityNotFoundException(SoundtrackErrorMessages.SOUNDTRACK_NOT_FOUND + name);
        }
        // can only update artist
        foundSoundtrack.setMovie(soundtrack.getMovie());
        foundSoundtrack.setSongs(soundtrack.getSongs());
        soundtrackRepository.save(foundSoundtrack);
        return foundSoundtrack;
    }

    @Override
    public Soundtrack delete(String name) throws EntityNotFoundException {
        Soundtrack foundSoundtrack = findByName(name);
        if (foundSoundtrack == null) {
            log.error(SoundtrackErrorMessages.SOUNDTRACK_NOT_FOUND + " {}", name);
            throw new EntityNotFoundException(SoundtrackErrorMessages.SOUNDTRACK_NOT_FOUND + name);
        }
        soundtrackRepository.delete(foundSoundtrack);
        return foundSoundtrack;
    }

    @Override
    public Soundtrack findByName(String name) {
        return soundtrackRepository.findByName(name).orElse(null);
    }

    private Soundtrack build(Soundtrack soundtrack) {
        return Soundtrack.SoundtrackBuilder.aSoundtrack().withName(soundtrack.getName()).withMovie(soundtrack.getMovie()).withSongs(soundtrack.getSongs()).build();
    }
}
