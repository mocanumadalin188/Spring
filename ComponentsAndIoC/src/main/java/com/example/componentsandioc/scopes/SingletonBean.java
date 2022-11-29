package com.example.componentsandioc.scopes;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class SingletonBean {
    public void dosomething() {
        log.info("comming from singleton bean");
    }
}
