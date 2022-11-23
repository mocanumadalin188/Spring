package com.example.beans.configuration;

import org.springframework.context.annotation.Configuration;

@Configuration
@org.springframework.boot.context.properties.ConfigurationProperties(prefix = "my.property")
public class ConfigurationProperties {
    private String anotherProperty;

    public String getAnotherProperty() {
        return anotherProperty;
    }

    public void setAnotherProperty(String anotherProperty) {
        this.anotherProperty = anotherProperty;
    }
}
