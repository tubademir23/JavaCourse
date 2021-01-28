package com.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//<context:component-scan base-package="com.springdemo"></context:component-scan>
@ComponentScan("com.springdemo")
public class IoCConfig {
	@Bean
	public ICustomerDal database() {
		return new  MySqlCustomerDal();
	}
}
