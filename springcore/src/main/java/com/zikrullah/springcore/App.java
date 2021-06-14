package com.zikrullah.springcore;

import java.util.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		
		  ApplicationContext context = new
		  ClassPathXmlApplicationContext("spring.xml");
		  
		  
		  Student one = (Student)context.getBean("student"); one.setId(25);
		  one.setName("zikrullah"); one.setAddr("gagillapur");
		  
		  Student two = (Student) context.getBean("studnet1");
		  
		  two.setId(100); two.setName("Arman"); two.setAddr("Medchal");
		  
		  System.out.println(one.getId()+" "+one.getId()+" "+one.getAddr());
		  System.out.println(two.getId()+" "+two.getId()+" "+two.getAddr());
		  
		 

	}
}
