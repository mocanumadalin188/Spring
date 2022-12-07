package com.example.springdatahibernate.simplerepository;

import com.example.springdatahibernate.entities.Review;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Component
@Transactional
public class ReviewSimpleRepositoryImpl implements ReviewSimpleRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Review save(Review review) {
        // merge-ul pastreaza obiectul dat ca parametru in persistenceContext
        entityManager.persist(review);
        review.setRating(10);
        return review;
    }

    @Override
    public Review updateRating(Review review) {
//        entityManager.merge(review);
        // merge-ul NU pastreaza obiectul dat ca parametru in persistenceContext -- deci avem nevoie de o variabila noua
        // merge-ul pastreaza rezultatul in persistanceContext
        Review newReview = entityManager.merge(review);
        newReview.setRating(9);
        newReview.setMessage("Third message - yuuuuuhuu!");
        return newReview;
    }

    @Override
    public Review updateExistentReview(long id) {
        Review review1 = entityManager.find(Review.class, id);
        review1.setMessage("Message updated yo");
        entityManager.merge(review1);
        return review1;

    }


//    @Override
//    public Review save(Review review) {
//            EntityManager entityManager = entityManagerFactory.createEntityManager();
//            /////   @Transactional -- inlocuieste cele 4 randuri de mai jos
//            EntityTransaction entityTransaction = entityManager.getTransaction();
//            if (!entityTransaction.isActive()) {
//                entityTransaction.begin();
//            }
    // TODO explain flush()
    // set a property on actor , actor is managed by the persistence context ,
    //                    it will be inserted with the new property
//            entityManager.persist(review);
//            entityTransaction.commit();
//            return review;
//    }
}
