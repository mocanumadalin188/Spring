package com.example.finalproject.mappers;

import com.example.finalproject.dtos.actors.ActorDTO;
import com.example.finalproject.dtos.actors.ActorUpdateDTO;
import com.example.finalproject.dtos.companies.CompanyDTO;
import com.example.finalproject.dtos.movies.MovieDTO;
import com.example.finalproject.dtos.movies.MovieUpdateDTO;
import com.example.finalproject.dtos.songs.SongDTO;
import com.example.finalproject.dtos.soundtracks.SoundtrackDTO;
import com.example.finalproject.dtos.soundtracks.SoundtrackUpdateDTO;
import com.example.finalproject.dtos.users.UserDTO;
import com.example.finalproject.entities.*;
import com.example.finalproject.request.ActorUpdate;
import com.example.finalproject.request.MovieUpdate;
import com.example.finalproject.request.SoundtrackUpdate;
import org.mapstruct.Mapper;

import java.util.Set;

@Mapper
public interface GenericMapper {

    ActorDTO actorToActorDTO(Actor actor);

    Actor actorDTOToActor(ActorDTO actor);

    Set<ActorDTO> actorToActorDTO(Set<Actor> actor);

    Set<Actor> actorDTOToActor(Set<ActorDTO> actor);

    MovieDTO movieToMovieDTO(Movie movie);

    Movie movieDTOToMovie(MovieDTO movie);

    Set<MovieDTO> movieToMovieDTO(Set<Movie> movie);

    Set<Movie> movieDTOToMovie(Set<MovieDTO> movie);

    CompanyDTO companyToCompanyDTO(Company company);

    Company companyDTOToCompany(CompanyDTO company);

    SongDTO songToSongDTO(Song song);

    Song songDTOToSong(SongDTO song);

    Set<SongDTO> songToSongDTO(Set<Song> song);

    Set<Song> songDTOToSong(Set<SongDTO> song);

    SoundtrackDTO soundtrackToSoundtrackDTO(Soundtrack sountrack);

    Soundtrack soundtrackDTOToSoundtrack(SoundtrackDTO sountrack);

    ActorUpdateDTO actorUpdateToActorUpdateDTO(ActorUpdate actorUpdate);

    ActorUpdate actorUpdateDTOToActorUpdate(ActorUpdateDTO actorUpdate);

    MovieUpdateDTO movieUpdateToMovieUpdateDTO(MovieUpdate movieUpdate);

    MovieUpdate movieUpdateDTOToMovieUpdate(MovieUpdateDTO movieUpdateDTO);

    SoundtrackUpdateDTO soundtrackUpdateToSoundtrackUpdateDTO(SoundtrackUpdate soundtrackUpdate);

    SoundtrackUpdate soundtrackUpdateDTOToSoundtrackUpdate(SoundtrackUpdateDTO soundtrackUpdate);

    UserDTO userToUserDTO(User user);

    User userDTOToUser(UserDTO user);
}
