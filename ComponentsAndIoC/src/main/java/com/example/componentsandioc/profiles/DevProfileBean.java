package com.example.componentsandioc.profiles;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
@Slf4j
public class DevProfileBean implements CommandLineRunner {

    @Value("${properties.prefix.newProperty}")
    private String newPropertyDev;

    @Value("${properties.prefix.myProperty2}")
    private String overridenProperty;

    @Value("${properties.prefix.myProperty3}")
    private String oldProperty;

    @Override
    public void run(String... args) throws Exception {
        log.info(newPropertyDev + "," + overridenProperty + "," + oldProperty);
    }
}
