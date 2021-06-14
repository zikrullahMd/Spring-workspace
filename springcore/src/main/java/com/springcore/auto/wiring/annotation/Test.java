package com.springcore.auto.wiring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/auto/wiring/annotation/autoconfig.xml");
		
		Address e = context.getBean("addr",Address.class);
		
		System.out.println(e.toString());
	}

}
