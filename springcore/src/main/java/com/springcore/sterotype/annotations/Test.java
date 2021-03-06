package com.springcore.sterotype.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/sterotype/annotations/config.xml");
		
		
		Student st = context.getBean("student",Student.class);
		Student st1 = context.getBean("student",Student.class);
		
		System.out.println(st.toString());
		
		st.getProjects().forEach((e)->System.out.println(e));
		
		System.out.println(st.hashCode());
		System.out.println(st1.hashCode());
	}

}
