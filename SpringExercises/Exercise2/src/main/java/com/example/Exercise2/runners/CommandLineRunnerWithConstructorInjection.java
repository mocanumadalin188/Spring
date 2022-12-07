package com.example.Exercise2.runners;

import com.example.Exercise2.DummyLogger;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
//@RequiredArgsConstructor
public class CommandLineRunnerWithConstructorInjection implements CommandLineRunner {

    private final DummyLogger dummyLogger;

    public CommandLineRunnerWithConstructorInjection(DummyLogger dummyLogger) {
        this.dummyLogger = dummyLogger;
    }

    @Override
    public void run(String... args) throws Exception {
        dummyLogger.sayHello();
    }
}
