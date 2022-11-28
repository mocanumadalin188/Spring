package com.example.finalproject.services;

import com.example.finalproject.entities.User;
import com.example.finalproject.exception.EntityNotFoundException;
import com.example.finalproject.jparepositories.UserRepository;
import com.example.finalproject.messages.UserErrorMessages;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
@Slf4j
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User create(User user) throws EntityNotFoundException {
        User foundUser = findByEmail(user.getEmail());
        if (foundUser != null) {
            log.error(UserErrorMessages.USER_ALREADY_FOUND + " {}", user.getEmail());
            throw new EntityNotFoundException(UserErrorMessages.USER_ALREADY_FOUND + user.getEmail());
        }
        userRepository.save(build(user));
        return user;
    }

    @Override
    public User findByEmail(String email) {
        return userRepository.findByEmail(email).orElse(null);
    }

    private User build(User user) {
        return User.UserBuilder
                .anUser()
                .withName(user.getName())
                .withEmail(user.getEmail())
                .withPassword(user.getPassword())
                .withRole(user.getRole())
                .build();
    }
}
