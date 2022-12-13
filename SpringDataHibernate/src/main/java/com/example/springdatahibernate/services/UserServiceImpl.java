package com.example.springdatahibernate.services;

import com.example.springdatahibernate.entities.User;
import com.example.springdatahibernate.exceptions.AlreadyExistsException;
import com.example.springdatahibernate.jparepositories.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@Slf4j
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User save(User user) {
        User userFound = userRepository.findByUserName(user.getUserName());

        if (userFound != null) {
//            throw new RuntimeException("User already exists!");
            throw new AlreadyExistsException("User already exists! ZZZZZZZZZ");
        } else {
            userRepository.save(user);
        }
        return user;
    }

    @Override
    public User update(User user, String userName) {
        User userFound = userRepository.findByUserName(userName);

        if (userFound == null) {
            throw new RuntimeException("User does not exist!");
        } else {
            userFound.setAge(user.getAge());
            userRepository.save(userFound);
        }
        return userFound;
    }

    @Override
    public void delete(String userName) {
        User userFound = userRepository.findByUserName(userName);
        if(userFound == null){
            throw  new RuntimeException("Usernot found to be deleted!");
        } else {
            userRepository.delete(userFound);
            log.info("User deleted!");
        }
    }
}
