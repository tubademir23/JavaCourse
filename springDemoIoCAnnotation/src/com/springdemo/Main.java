package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		//dependency injection
		ClassPathXmlApplicationContext context=
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//add constructor_arg to bean
		ICustomerDal customerDal= context.getBean("database", ICustomerDal.class);
		
		customerDal.add();
	}

}
