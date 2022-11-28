package com.example.springdatahibernate.jparepositories;

import com.example.springdatahibernate.entities.Song;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRepository extends JpaRepository<Song, Long> {
}
