package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/lifeconfig.xml");
		
		Samosa aaloo = (Samosa) context.getBean("samosa");
		
		System.out.println(aaloo.toString());
		
		context.registerShutdownHook();
	}

}
