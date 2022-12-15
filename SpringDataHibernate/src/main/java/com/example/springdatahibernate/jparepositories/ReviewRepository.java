package com.example.springdatahibernate.jparepositories;

import com.example.springdatahibernate.entities.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Long> {

}
