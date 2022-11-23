package com.example.beans.components;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@Primary
public class ElectricCar implements NewGenerationCar {

    @Override
    public void showBattery() {
        log.info("Show battery of electric car");
    }
}
