package com.example.Exercise2.runners;

import com.example.Exercise2.DummyLogger;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class CommandLineRunnerWithSetterInjection implements CommandLineRunner {
    private DummyLogger dummyLogger;

    @Autowired
    public void setDummyLogger(final DummyLogger dummyLogger){
        this.dummyLogger = dummyLogger;
    }

    @Override
    public void run(String... args) throws Exception {
        dummyLogger.sayHello();
    }
}
