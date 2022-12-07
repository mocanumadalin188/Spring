package com.example.beans.runners;

import com.example.beans.services.SingletonVsPrototypeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
//@RequiredArgsConstructor  // pentru cazul în care nu se face „constructor injection”
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
