package com.example.componentsandioc.scopes;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class SingletonBean {
    @Autowired
    private PrototypeBean prototypeBean;
    @Autowired
    private PrototypeBean prototypeBean2;

    @Lookup
    public PrototypeBean getPrototypeBean() {
        return prototypeBean;
    }

    public PrototypeBean getPrototypeBean2() {
        return prototypeBean2;
    }

    public void dosomething() {
        log.info("comming from singleton bean");
    }
}
