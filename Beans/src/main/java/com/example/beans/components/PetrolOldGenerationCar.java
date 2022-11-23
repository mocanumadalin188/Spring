package com.example.beans.components;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class PetrolOldGenerationCar implements OldGenerationCar {

    @Override
    public void verifyFuel() {
        log.info("Petrol");
    }

    @Override
    public void turnOnEngine() {
        log.info("Petrol engine turning on");
    }
}
