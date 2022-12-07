package com.example.Exercise3.runners;

import com.example.Exercise3.beans.DummyLogger;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class WithSecondaryCommandLineRunner implements CommandLineRunner {

//    @Autowired
//    @Qualifier(value = "secondDummyLogger")
    private final DummyLogger dummyLogger;


    public WithSecondaryCommandLineRunner(@Qualifier(value = "secondDummyLogger") final DummyLogger dummyLogger) {
        this.dummyLogger = dummyLogger;
    }


    @Override
    public void run(String... args) throws Exception {
        dummyLogger.sayHello();
    }
}
