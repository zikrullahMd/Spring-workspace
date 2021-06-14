package com.zikrullah.constructor_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("constconfig.xml");
		
		Student s = (Student) context.getBean("student");
		System.out.println(s.toString());
	}

}
