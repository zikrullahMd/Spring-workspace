package com.springcore.auto.wiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/auto/wiring/autoconfig.xml");
		
		Employee e = context.getBean("employee",Employee.class);
		
		System.out.println(e);
	}

}
