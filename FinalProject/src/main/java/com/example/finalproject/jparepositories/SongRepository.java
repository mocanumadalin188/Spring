package com.example.finalproject.jparepositories;

import com.example.finalproject.entities.Song;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SongRepository extends JpaRepository<Song, Long> {

    Optional<Song> findByName(String name);
}
