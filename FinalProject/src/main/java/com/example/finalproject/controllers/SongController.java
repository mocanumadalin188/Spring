package com.example.finalproject.controllers;

import com.example.finalproject.dtos.songs.SongDTO;
import com.example.finalproject.exception.EntityAlreadyExistsException;
import com.example.finalproject.exception.EntityNotFoundException;
import com.example.finalproject.mappers.GenericMapper;
import com.example.finalproject.services.SongService;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("songs")
public class SongController {

    @Autowired
    private SongService songService;

    private final GenericMapper mapper = Mappers.getMapper(GenericMapper.class);

    @PostMapping
    public ResponseEntity<?> create(@RequestBody SongDTO songDTO) throws EntityAlreadyExistsException {
        return new ResponseEntity<>(mapper.songToSongDTO(songService.create(mapper.songDTOToSong(songDTO))), HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<?> delete(@PathVariable("name") String name) throws EntityNotFoundException {
        return new ResponseEntity<>(mapper.songToSongDTO(songService.delete(name)), HttpStatus.OK);
    }
}
