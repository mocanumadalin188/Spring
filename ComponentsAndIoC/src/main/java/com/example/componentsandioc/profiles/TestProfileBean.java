package com.example.componentsandioc.profiles;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;


@Component
@Slf4j
@Profile("!dev")
public class TestProfileBean implements CommandLineRunner {

    @Value("${properties.prefix.newProperty}")
    private String notDevProperty;


    @Override
    public void run(String... args) throws Exception {
        log.info(notDevProperty);
    }
}
