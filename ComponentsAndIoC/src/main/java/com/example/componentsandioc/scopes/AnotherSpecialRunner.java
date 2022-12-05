package com.example.componentsandioc.scopes;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class AnotherSpecialRunner implements CommandLineRunner {
    @Autowired
    private SingletonBean singletonBean;
    @Autowired
    private ApplicationContext applicationContext;

    @Override
    public void run(String... args) throws Exception {

//        log.info("AnotherSpecialRunner");
//        log.info(String.valueOf(singletonBean.getPrototypeBean().hashCode()));
//        log.info(String.valueOf(singletonBean.getPrototypeBean().hashCode()));
//
//        log.info(String.valueOf(singletonBean.getPrototypeBean2().hashCode()));
//        log.info(String.valueOf(singletonBean.getPrototypeBean2().hashCode()));
    }
}
