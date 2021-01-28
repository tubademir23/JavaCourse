package com.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//<context:component-scan base-package="com.springdemo"></context:component-scan>
@ComponentScan("com.springdemo")
@PropertySource("classpath:values.properties")
public class IoCConfig {
	@Bean
	public ICustomerDal database() {
		return new  MsSqlCustomerDal();
	}
	@Bean
	public ICustomerService service() {
		return new  CustomerManager(database());
	}
}
