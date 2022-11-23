package com.example.beans.runners;

import com.example.beans.services.SingletonVsPrototypeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class SingletonVsPrototypeRunner implements CommandLineRunner {

    private final SingletonVsPrototypeService singletonVsPrototypeService;

    // constructor injection
    public SingletonVsPrototypeRunner(SingletonVsPrototypeService singletonVsPrototypeService) {
        this.singletonVsPrototypeService = singletonVsPrototypeService;
    }

    @Override
    public void run(String... args) {
//        log.info("SingletonVsPrototypeRunner************************************");
//        singletonVsPrototypeService.test();
    }
}
