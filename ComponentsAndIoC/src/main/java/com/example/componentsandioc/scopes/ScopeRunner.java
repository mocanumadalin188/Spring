package com.example.componentsandioc.scopes;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Component
@Slf4j
public class ScopeRunner implements CommandLineRunner {
    @Autowired
    private SingletonBean singletonBean;

    @Autowired
    private PrototypeBean prototypeBean;

    @Autowired
    private PrototypeBean prototypeBean2;

    @Autowired
    private ApplicationContext applicationContext;

    @Override
    public void run(String... args) throws Exception {
//        List<SingletonBean> singletonBeanList = new ArrayList<>();
//
//        int[] array = {1, 2, 3, 4, 5};
//        IntStream.of(array).forEach(index -> {
//            SingletonBean singletonBean1 = applicationContext.getBean("singletonBean", SingletonBean.class);
//            singletonBeanList.add(singletonBean1);
//        });
//
//        singletonBeanList.add(singletonBean);
//
//        singletonBeanList.stream().map(elem -> elem.hashCode())
//                .forEach(hash -> log.info(String.valueOf(hash)));
//
//        List<PrototypeBean> prototypeBeanList = new ArrayList<>();
//        IntStream.of(array).forEach((index -> {
//            PrototypeBean prototypeBean = applicationContext.getBean("prototypeBean", PrototypeBean.class);
//            prototypeBeanList.add(prototypeBean);
//
//        }));
//        prototypeBeanList.add(prototypeBean);
//        prototypeBeanList.add(prototypeBean2);
//
//        prototypeBeanList.stream().map(elem -> elem.hashCode())
//                .forEach(hash -> log.info(String.valueOf(hash)));
//
//
    }
}
