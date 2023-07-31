package com.example.demo.model;

import org.springframework.stereotype.Component;

@Component
public class ClassA {
    public void printHello(){
        System.out.println("Hello");

    }
    public int getNum(){
        System.out.println("Get Num Called");
        return 54;
    }
    public int getSum(int a, int b){
        return a+b;
    }
}
