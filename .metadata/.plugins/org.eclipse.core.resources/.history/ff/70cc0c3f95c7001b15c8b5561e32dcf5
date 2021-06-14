package com.zikrullah.Practice;

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
        ApplicationContext context = new ClassPathXmlApplicationContext("com/zikrullah/Practice/config.xml");
        
        Student s = context.getBean("student",Student.class);
        
        System.out.println(s.toString());
        
    }
}
