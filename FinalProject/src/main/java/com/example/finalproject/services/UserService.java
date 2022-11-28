package com.example.finalproject.services;

import com.example.finalproject.entities.User;
import com.example.finalproject.exception.EntityNotFoundException;

public interface UserService {

    User create(User user) throws EntityNotFoundException;

    User findByEmail(String email);
}
