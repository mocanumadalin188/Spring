package com.example.springdatahibernate.runners;

import com.example.springdatahibernate.entities.Actor;
import com.example.springdatahibernate.entities.Review;
import com.example.springdatahibernate.simplerepository.ReviewSimpleRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class EntityManagerRunner implements CommandLineRunner {

    @Autowired
    private ReviewSimpleRepository reviewSimpleRepository;

    @Override
    public void run(String... args) throws Exception {
        Review ourReview = new Review();
        ourReview.setRating(8);
        ourReview.setMessage("We like it!");
//        ourReview.setId(2);  nu se poate seta - odata ce este autogenerat

//        reviewSimpleRepository.save(ourReview);

//        reviewSimpleRepository.updateRating(ourReview);

        reviewSimpleRepository.updateExistentReview(5);

    }
}
