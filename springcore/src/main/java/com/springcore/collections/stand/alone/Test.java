package com.springcore.collections.stand.alone;

import java.beans.Expression;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/collections/stand/alone/standaloneconfig.xml");
		
		Person p = context.getBean("person",Person.class);
		
		System.out.println(p.toString());
		
		
	}

}
