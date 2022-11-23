package com.example.beans.runners;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class SingletonContainingPrototypeRunner implements CommandLineRunner {

    @Autowired
    private ApplicationContext applicationContext;

    @Override
    public void run(String... args) {
//        log.info("SingletonContainingPrototypeRunner************************************");
//
//        AnotherSingletonBean anotherSingletonBean1 =
//                (AnotherSingletonBean) applicationContext.getBean("anotherSingletonBean");
//        AnotherSingletonBean anotherSingletonBean2 =
//                (AnotherSingletonBean) applicationContext.getBean("anotherSingletonBean");
//        log.info(String.valueOf(
//                anotherSingletonBean1.getAnotherPrototypeBean() == anotherSingletonBean2.getAnotherPrototypeBean()));
        // how to solve? we want different instances since it is prototype

    }
}
