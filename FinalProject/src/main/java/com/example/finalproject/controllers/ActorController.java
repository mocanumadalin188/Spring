package com.example.finalproject.controllers;

import com.example.finalproject.dtos.actors.ActorDTO;
import com.example.finalproject.dtos.actors.ActorUpdateDTO;
import com.example.finalproject.exception.EntityAlreadyExistsException;
import com.example.finalproject.exception.EntityNotFoundException;
import com.example.finalproject.mappers.GenericMapper;
import com.example.finalproject.services.ActorService;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("actors")
public class ActorController {

    @Autowired
    private ActorService actorService;

    private final GenericMapper mapper = Mappers.getMapper(GenericMapper.class);

    @GetMapping("/minimumMovies/{nrOfMovies}")
    public ResponseEntity<?> findActorsWithMinimumMoviesPlayed(@PathVariable("nrOfMovies") int nrOfMovies) {
        List<ActorDTO> actorDTOs = actorService
                .findActorsWithMinimumMoviesPlayed(nrOfMovies)
                .stream()
                .map(mapper::actorToActorDTO)
                .toList();
        return new ResponseEntity<>(actorDTOs, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody ActorDTO actorDTO) throws EntityAlreadyExistsException, EntityNotFoundException {
        return new ResponseEntity<>(mapper.actorToActorDTO(actorService.create(mapper.actorDTOToActor(actorDTO))), HttpStatus.OK);
    }

    @DeleteMapping("/{email}")
    public ResponseEntity<?> delete(@PathVariable("email") String email) throws EntityNotFoundException {
        return new ResponseEntity<>(mapper.actorToActorDTO(actorService.delete(email)), HttpStatus.OK);
    }

    @PutMapping("/{email}")
    public ResponseEntity<?> update(@RequestBody ActorUpdateDTO actorUpdateDTO, @PathVariable("email") String email) throws EntityNotFoundException, EntityAlreadyExistsException {
        return new ResponseEntity<>(mapper.actorToActorDTO(actorService.update(mapper.actorUpdateDTOToActorUpdate(actorUpdateDTO), email)), HttpStatus.OK);
    }

    @GetMapping
    @PreAuthorize("hasAuthority('USER')")
    public ResponseEntity<?> findAll() {
        List<ActorDTO> actors = actorService.findAll().stream().map(mapper::actorToActorDTO).toList();
        return new ResponseEntity<>(actors, HttpStatus.OK);
    }

}
