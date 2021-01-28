package com.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		//class config instead of file config, give class name 
		AnnotationConfigApplicationContext context=
				new AnnotationConfigApplicationContext(IoCConfig.class);
		
		//find by context scan
		ICustomerService customerService = context.getBean("service", ICustomerService.class);
		
		customerService.add();
	}

}
