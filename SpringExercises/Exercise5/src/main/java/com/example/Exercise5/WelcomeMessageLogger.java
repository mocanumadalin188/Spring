package com.example.Exercise5;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import static java.lang.Boolean.TRUE;

@Component
@Slf4j
public class WelcomeMessageLogger implements CommandLineRunner {

    private final String text;
    private final Boolean shouldLog;


    public WelcomeMessageLogger(@Value("${pl.sdacademy.welcome.text.value}") final String text,
                                @Value("${pl.sdacademy.welcome.text.enable}") final Boolean shouldLog) {
        this.text = text;
        this.shouldLog = shouldLog;
    }

    @Override
    public void run(String... args) throws Exception {
        if(TRUE.equals(shouldLog)){
            log.info(text);
        }
    }
}
