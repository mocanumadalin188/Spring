package com.example.beans.services;


import com.example.beans.pojo.PrototypeBean;
import com.example.beans.pojo.SingletonBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Component
@Slf4j
public class SingletonVsPrototypeService {

    @Autowired
    private ApplicationContext applicationContext;

    public void test() {
        int[] array = {1, 2, 3, 4, 5};
        List<PrototypeBean> prototypeBeanList = new ArrayList<>();
        IntStream.of(array).forEach(a -> {
            SingletonBean singletonBean = (SingletonBean) applicationContext.getBean("singletonBean");
            // get an instance of prototype bean
            PrototypeBean prototypeBean = (PrototypeBean) applicationContext.getBean("prototypeBean");
            prototypeBeanList.add(prototypeBean);
            log.info("SingletonBean Object {} with hashCode {}", a, singletonBean.hashCode());
            log.info("Prototype Object {} with hashCode {}", a, prototypeBean.hashCode());
        });

        log.info(String.valueOf(prototypeBeanList.get(0) == prototypeBeanList.get(1)));

        // what if we inject a prototype into a singleton?
    }
}
