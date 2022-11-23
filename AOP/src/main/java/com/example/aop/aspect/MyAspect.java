package com.example.aop.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * Not really a regex -> pointcut
 * After method -> advice
 * Aspect -> the class where all this takes place
 * JoinPoint -> a single execution of the advice
 */
@Component
@Aspect
@Slf4j
public class MyAspect {

    @After(value = "execution(* com.example.aop.service.MyService.*(..))")
    public void after(JoinPoint joinPoint) {
        log.info("after execution of {}", joinPoint);
    }
}
