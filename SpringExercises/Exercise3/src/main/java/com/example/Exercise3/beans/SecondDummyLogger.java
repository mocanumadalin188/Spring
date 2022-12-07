package com.example.Exercise3.beans;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class SecondDummyLogger implements DummyLogger{
    @Override
    public void sayHello() {
        log.info("Hello from SecondBean!");
    }
}
