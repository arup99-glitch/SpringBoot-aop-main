package com.example.demo;

import com.example.demo.configuration.AopConfiguration;
import com.example.demo.model.ClassA;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringAopApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context= SpringApplication.run(SpringAopApplication.class, args);
		ClassA a=context.getBean(ClassA.class);
		a.printHello();
		int num=a.getNum();
		System.out.println(a.getSum(num,num));
	}

}
