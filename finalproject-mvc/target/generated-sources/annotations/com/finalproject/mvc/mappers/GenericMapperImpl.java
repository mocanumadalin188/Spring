package com.finalproject.mvc.mappers;

import com.finalproject.mvc.controller.dto.ActorDTO;
import com.finalproject.mvc.controller.dto.MovieDTO;
import com.finalproject.mvc.controller.dto.RoleDTO;
import com.finalproject.mvc.entity.Actor;
import com.finalproject.mvc.entity.Movie;
import com.finalproject.mvc.entity.Role;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-12-11T14:01:29+0200",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.4.1 (Oracle Corporation)"
)
public class GenericMapperImpl implements GenericMapper {

    @Override
    public Actor actorDTOToActor(ActorDTO actor) {
        if ( actor == null ) {
            return null;
        }

        Actor actor1 = new Actor();

        actor1.setName( actor.getName() );
        actor1.setAge( actor.getAge() );
        actor1.setEmail( actor.getEmail() );
        actor1.setMovies( movieDTOSetToMovieSet( actor.getMovies() ) );

        return actor1;
    }

    @Override
    public Movie movieDTOToMovie(MovieDTO movie) {
        if ( movie == null ) {
            return null;
        }

        Movie movie1 = new Movie();

        movie1.setName( movie.getName() );
        movie1.setType( movie.getType() );
        movie1.setDuration( movie.getDuration() );
        movie1.setActors( actorDTOSetToActorSet( movie.getActors() ) );

        return movie1;
    }

    @Override
    public Role roleDTOToRole(RoleDTO role) {
        if ( role == null ) {
            return null;
        }

        Role role1 = new Role();

        role1.setName( role.getName() );

        return role1;
    }

    protected Set<Movie> movieDTOSetToMovieSet(Set<MovieDTO> set) {
        if ( set == null ) {
            return null;
        }

        Set<Movie> set1 = new LinkedHashSet<Movie>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( MovieDTO movieDTO : set ) {
            set1.add( movieDTOToMovie( movieDTO ) );
        }

        return set1;
    }

    protected Set<Actor> actorDTOSetToActorSet(Set<ActorDTO> set) {
        if ( set == null ) {
            return null;
        }

        Set<Actor> set1 = new LinkedHashSet<Actor>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( ActorDTO actorDTO : set ) {
            set1.add( actorDTOToActor( actorDTO ) );
        }

        return set1;
    }
}
