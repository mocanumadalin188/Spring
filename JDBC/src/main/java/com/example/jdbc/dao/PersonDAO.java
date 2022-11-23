package com.example.jdbc.dao;

import com.example.jdbc.pojo.Person;

import java.util.List;

public interface PersonDAO {

    //Create
    void save(Person employee);

    //Read
    Person getById(int id);

    //Update
    void update(Person employee);

    //Delete
    void deleteById(int id);

    //Get All
    List<Person> getAll();
}
