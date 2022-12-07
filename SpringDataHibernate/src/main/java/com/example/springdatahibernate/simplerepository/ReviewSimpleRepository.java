package com.example.springdatahibernate.simplerepository;

import com.example.springdatahibernate.entities.Review;

public interface ReviewSimpleRepository {
    Review save(Review review);

    Review updateRating(Review review);

    Review updateExistentReview(long id);

}
