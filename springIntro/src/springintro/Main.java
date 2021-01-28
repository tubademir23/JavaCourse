package springintro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//dependency injection
		ClassPathXmlApplicationContext context=
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		CustomerManager manager=new CustomerManager(context.getBean("database", ICustomerDal.class));
		manager.add();
	}

	//IoC=Inversion of Control
	//Dependency Injection
}
