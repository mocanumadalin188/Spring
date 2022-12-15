package com.example.springdatahibernate.runners;

import com.example.springdatahibernate.services.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class TransactionRunner implements CommandLineRunner {

    @Autowired
    private ReviewService reviewService;

    @Transactional
    @Override
    public void run(String... args) throws Exception {

        reviewService.create();

        reviewService.createAnother();

    }
}
