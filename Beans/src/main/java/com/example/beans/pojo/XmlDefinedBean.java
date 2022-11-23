package com.example.beans.pojo;


import lombok.extern.slf4j.Slf4j;

@Slf4j
public class XmlDefinedBean {

    public void initializeBean() {
        log.info("XmlDefinedBean is initialized after loading in application context");
    }

    public void doSomething() {
        log.info("Do something in xml defined bean");
    }
}
