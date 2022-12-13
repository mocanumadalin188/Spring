package com.example.springdatahibernate.services;

import com.example.springdatahibernate.entities.User;

public interface UserService {

    User save(User user);

    User update(User user, String userName);

    void delete(String userName);
}
