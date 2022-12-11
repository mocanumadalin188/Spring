package com.finalproject.mvc.mappers;

import com.finalproject.mvc.controller.dto.ActorDTO;
import com.finalproject.mvc.controller.dto.MovieDTO;
import com.finalproject.mvc.controller.dto.RoleDTO;
import com.finalproject.mvc.entity.Actor;
import com.finalproject.mvc.entity.Movie;
import com.finalproject.mvc.entity.Role;
import org.mapstruct.Mapper;

@Mapper
public interface GenericMapper {
    Actor actorDTOToActor(ActorDTO actor);

    Movie movieDTOToMovie(MovieDTO movie);

    Role roleDTOToRole(RoleDTO role);
}
