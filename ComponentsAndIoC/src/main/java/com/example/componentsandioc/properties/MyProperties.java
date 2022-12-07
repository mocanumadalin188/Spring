package com.example.componentsandioc.properties;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties (prefix = "properties.prefix")
public class MyProperties {
    private String myProperty1;
    private String myProperty2;

    public String getMyProperty1() {
        return myProperty1;
    }

    public void setMyProperty1(String myProperty1) {
        this.myProperty1 = myProperty1;
    }

    public String getMyProperty2() {
        return myProperty2;
    }

    public void setMyProperty2(String myProperty2) {
        this.myProperty2 = myProperty2;
    }
}

