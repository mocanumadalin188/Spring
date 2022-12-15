package com.example.springdatahibernate.services;

import com.example.springdatahibernate.entities.Review;
import com.example.springdatahibernate.jparepositories.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Service
public class ReviewService {

    @Autowired
    private ReviewRepository reviewRepository;

//    @Transactional(propagation = Propagation.REQUIRED) - -- este default! == @Transactional
    @Transactional
    public void create(){
        Review reviewToBeCreated = new Review();
        reviewToBeCreated.setRating(1);
        reviewToBeCreated.setMessage("message1");
        reviewToBeCreated.setAlDateTime(new Date());
        reviewRepository.save(reviewToBeCreated);
    }

//    @Transactional(propagation = Propagation.MANDATORY)
    // va da o exceptie daca nu este o tranzactie care ruleaza in curs...
//    daca exista o tranzactie in curs o va lua pe aceea

//    @Transactional(propagation = Propagation.NEVER)
//    va da o exceptie daca avem o tranzactie activa

//    @Transactional(propagation = Propagation.REQUIRES_NEW)



//    @Transactional(isolation = Isolation.READ_COMMITTED)
//    @Transactional(isolation = Isolation.READ_UNCOMMITTED)
//    @Transactional(isolation = Isolation.REPEATABLE_READ)
//    @Transactional(isolation = Isolation.SERIALIZABLE)

    public void createAnother(){
        Review reviewToBeCreated = new Review();
        reviewToBeCreated.setRating(2);
        reviewToBeCreated.setMessage("message2");
        reviewToBeCreated.setAlDateTime(new Date());
        reviewRepository.save(reviewToBeCreated);
//        throw new RuntimeException();
    }




}
