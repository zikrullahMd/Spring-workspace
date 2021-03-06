package com.zikrullah.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.zikrullah.springjdbc.dao.StudentDao;
import com.zikrullah.springjdbc.entity.Student;

import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner in = new Scanner(System.in);
        ApplicationContext context = new ClassPathXmlApplicationContext("com/zikrullah/springjdbc/config.xml");
        
       StudentDao s = context.getBean("studentDao",StudentDao.class);
       
       Student student = new Student();
       student.setSid(8520);
       student.setName("Chama Dhattarwal");
       student.setAddress("Kali Linux");
       
       int res = s.insert(student);
       
       System.out.println("insert "+res+" items");
       
       
        
    }
}

