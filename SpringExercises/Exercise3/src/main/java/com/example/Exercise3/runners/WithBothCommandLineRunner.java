package com.example.Exercise3.runners;

import com.example.Exercise3.beans.DummyLogger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class WithBothCommandLineRunner implements CommandLineRunner {

//    @Autowired
    private final List<DummyLogger> loggerList;

    public WithBothCommandLineRunner(final List<DummyLogger> loggerList) {
        this.loggerList = loggerList;
    }

    @Override
    public void run(String... args) throws Exception {
        loggerList.forEach(DummyLogger::sayHello);
    }
}
