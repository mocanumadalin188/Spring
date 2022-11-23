package com.example.beans.runners;

import com.example.beans.services.CarService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class CarRunner implements CommandLineRunner {

    private final CarService carService;

    // constructor injection
    public CarRunner(CarService carService) {
        this.carService = carService;
    }

    @Override
    public void run(String... args) {
//        log.info("CarRunner************************************");
//        carService.testCar();
    }
}
