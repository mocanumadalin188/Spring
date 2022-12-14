package com.example.springdatahibernate.runners;

import com.example.springdatahibernate.entities.User;
import com.example.springdatahibernate.jparepositories.UserRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class ObjectMapperRunner implements CommandLineRunner {

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
//        User userFound = userRepository.findByUserName("vasile");
//
//        log.info(objectMapper.writeValueAsString(userFound));
//
//        String jsonObject = objectMapper.writeValueAsString(userFound);
//        User userReturned = objectMapper.readValue(jsonObject, User.class);
//        log.info(userReturned.getUserName());



    }
}
