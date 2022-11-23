package com.example.beans.pojo;


import lombok.extern.slf4j.Slf4j;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Slf4j
public class Mechanic {

    public void prepare() {
        log.info("Do something in electric car");
    }

    // REMOVED IN JAVA 11 - need to add dependency to use them
    @PostConstruct
    public void init() {
        log.info("Executing after the bean gets into the application context");
    }

    @PreDestroy
    public void destroy() {
        log.info("Executing before closing the application context");
    }
}
