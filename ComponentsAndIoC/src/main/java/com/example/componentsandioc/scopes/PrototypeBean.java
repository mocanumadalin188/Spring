package com.example.componentsandioc.scopes;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@Scope(value = "prototype")
public class PrototypeBean {
    public void dosomething() {
        log.info("comming from prototype bean");
    }
}
