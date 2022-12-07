package com.example.Exercise3.runners;

import com.example.Exercise3.beans.DummyLogger;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class WithPrimaryCommandLineRunner implements CommandLineRunner {

    private final DummyLogger dummyLogger;

    @Override
    public void run(String... args) throws Exception {
        dummyLogger.sayHello();
    }
}
