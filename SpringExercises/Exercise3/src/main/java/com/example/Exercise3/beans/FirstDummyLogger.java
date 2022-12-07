package com.example.Exercise3.beans;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@Primary
public class FirstDummyLogger implements DummyLogger{
    @Override
    public void sayHello() {
        log.info("Hello from FirstBean!");
    }
}
