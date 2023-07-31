package com.example.demo.configuration;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.LoggerFactory;

import org.slf4j.Logger;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AopConfiguration {
    Logger logger = LoggerFactory.getLogger(AopConfiguration.class);
    @Before("execution(* com.example.demo.model.ClassA.printHello (..))")
    public void beforeHello() {
        logger.info("Before calling method: printHello()");
    }
    @Before("execution(* com.example.demo.model.ClassA.getNum (..))")
    public void beforeGetNum() {
        logger.info("Before calling method: GetNum()");
    }
    @Before("execution(* com.example.demo.model.ClassA.getSum (..))")
    public void beforeGetSum() {
        logger.info("Before calling method: getSum()");
    }
}
