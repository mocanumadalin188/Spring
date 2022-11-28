package com.example.finalproject.components;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

// can also use "!" for not
@Profile("test")
@Component
@Slf4j
public class TestLogger implements CommandLineRunner {

    @Value("${global.profile.message}")
    private String message;

    @Override
    public void run(String... args) {
        log.info(message);
    }
}
