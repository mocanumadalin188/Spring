package com.example.componentsandioc.components;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfiguration {
    @Bean
    public Adolescent adolescent(){
        return new Adolescent();

    }

}
