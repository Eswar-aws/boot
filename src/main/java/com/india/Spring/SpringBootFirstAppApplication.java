package com.india.Spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootFirstAppApplication {

	public static void main(String[] args) {
		ApplicationContext ct=SpringApplication.run(SpringBootFirstAppApplication.class, args);
		Object ob=ct.getBean("firstClass");
		System.out.println(ob);
	}

}
