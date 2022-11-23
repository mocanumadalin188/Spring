package com.example.beans.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AnotherSingletonBean {

    @Autowired
    private AnotherPrototypeBean anotherPrototypeBean;

//    @Lookup
    public AnotherPrototypeBean getAnotherPrototypeBean() {
        return anotherPrototypeBean;
    }

    public void setAnotherPrototypeBean(AnotherPrototypeBean anotherPrototypeBean) {
        this.anotherPrototypeBean = anotherPrototypeBean;
    }
}
