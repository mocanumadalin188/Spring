package com.example.aop.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class MyService {

    public void doSomething() {
        log.info("Do something");
    }
}
