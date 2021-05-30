package com.zikrullah.App;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//		<-------------XML way of configuration------------------------->
//        ApplicationContext context = new ClassPathXmlApplicationContext("NewFile.xml");
//        
//        Vehicle obj = (Vehicle) context.getBean("vehicle");
//        obj.running();
    	
//		<--------------Annotation configuration---------------------------->
		/*
		 * ApplicationContext context = new
		 * ClassPathXmlApplicationContext("NewFile.xml"); Vehicle obj = (Vehicle)
		 * context.getBean("car"); Vehicle obj1 = (Vehicle) context.getBean("vehicle");
		 * obj.running(); obj1.running();
		 */
    	ApplicationContext context = new ClassPathXmlApplicationContext("NewFile.xml");
    	Tyre t = (Tyre) context.getBean("tyre");
    	//t.setBrand("Xik");
    	System.out.println(t.toString());
    }
}