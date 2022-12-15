package com.example.springdatahibernate.entities;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "review")
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "rating")
    private int rating;

    @Temporal(TemporalType.TIMESTAMP)
    @Column
    private java.util.Date alDateTime;

    @Column(name = "message")
    private String message;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getAlDateTime() {
        return alDateTime;
    }

    public void setAlDateTime(Date alDateTime) {
        this.alDateTime = alDateTime;
    }
}
