package com.example.beans.configuration;

import com.example.beans.pojo.Mechanic;
import com.example.beans.pojo.PrototypeBean;
import com.example.beans.pojo.SingletonBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeanConfigurationCreation {

    @Bean
    public Mechanic mechanic() {
        return new Mechanic();
    }

    // default singleton - eager by default
    @Bean
    @Scope(value = "singleton")
    public SingletonBean singletonBean() {
        return new SingletonBean();
    }

    // lazy eval when it is needed - new instance
    @Bean
    @Scope(value = "prototype")
    public PrototypeBean prototypeBean() {
        return new PrototypeBean();
    }

}
