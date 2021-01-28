package springintro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		//dependency injection
		ClassPathXmlApplicationContext context=
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//add constructor_arg to bean
		ICustomerService customerService= context.getBean("service", ICustomerService.class);
		
		customerService.add();
	}

	//IoC=Inversion of Control
	//Dependency Injection
}
