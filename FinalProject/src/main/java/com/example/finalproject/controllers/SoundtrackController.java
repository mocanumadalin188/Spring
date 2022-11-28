package com.example.finalproject.controllers;

import com.example.finalproject.dtos.soundtracks.SoundtrackDTO;
import com.example.finalproject.dtos.soundtracks.SoundtrackUpdateDTO;
import com.example.finalproject.exception.EntityAlreadyExistsException;
import com.example.finalproject.exception.EntityNotFoundException;
import com.example.finalproject.mappers.GenericMapper;
import com.example.finalproject.services.SoundtrackService;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("soundtracks")
public class SoundtrackController {

    @Autowired
    private SoundtrackService soundtrackService;

    private final GenericMapper mapper = Mappers.getMapper(GenericMapper.class);

    @PostMapping
    public ResponseEntity<?> create(@RequestBody SoundtrackDTO soundtrackDTO) throws EntityAlreadyExistsException, EntityNotFoundException {
        return new ResponseEntity<>(mapper.soundtrackToSoundtrackDTO(soundtrackService.create(mapper.soundtrackDTOToSoundtrack(soundtrackDTO))), HttpStatus.OK);
    }

    @PutMapping("/{name}")
    public ResponseEntity<?> update(@RequestBody SoundtrackUpdateDTO soundtrackUpdateDTO, @PathVariable("name") String name) throws EntityNotFoundException {
        return new ResponseEntity<>(mapper.soundtrackToSoundtrackDTO(soundtrackService.update(mapper.soundtrackUpdateDTOToSoundtrackUpdate(soundtrackUpdateDTO), name)), HttpStatus.OK);
    }

    @DeleteMapping("/{name}")
    public ResponseEntity<?> delete(@PathVariable("name") String name) throws EntityNotFoundException {
        return new ResponseEntity<>(mapper.soundtrackToSoundtrackDTO(soundtrackService.delete(name)), HttpStatus.OK);
    }
}
