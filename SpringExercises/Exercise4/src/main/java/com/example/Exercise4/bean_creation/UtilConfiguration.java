package com.example.Exercise4.bean_creation;

import com.example.Exercise4.pojo.DummyLogger;
import com.example.Exercise4.pojo.ListUtil;
import com.example.Exercise4.pojo.StringUtil;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UtilConfiguration {

    @Bean
    public DummyLogger dummyLogger(){
        return new DummyLogger();
    }

    @Bean
    public ListUtil listUtility(){
        return new ListUtil();
    }

    @Bean (name = "stringUtility")
    public StringUtil stringUtil(){
        return new StringUtil();
    }


}
