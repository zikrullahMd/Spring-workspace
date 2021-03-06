package com.zikrullah.jdbc.employee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zikrullah.jdbc.employee.dao.EmployeeImp;
import com.zikrullah.jdbc.employee.entity.Employee;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		System.out.println("this is master");
		System.out.println("this is dev");
		Scanner in = new Scanner(System.in);
		ApplicationContext context = new ClassPathXmlApplicationContext("com/zikrullah/jdbc/employee/empconfig.xml");
		
		EmployeeImp e = context.getBean("employeedao",EmployeeImp.class);
		
		Employee emp = new Employee();
		
		System.out.println("Press 1 to insert || Press 2 to update || Press 3 for delete || Press 4 for Selecting || Press 5 for selecting all table");
		
		int n = in.nextInt();
		
		switch(n) {
		case 1 : {
			System.out.println("Enter number of data to insert");
			int t = in.nextInt();
			while(t-->0) {
				int id = in.nextInt();
				String name = in.next();
				String role = in.next();
				String project = in.next();
				emp.setSid(id);
				emp.setName(name);
				emp.setRole(role);
				emp.setProject(project);
				System.out.println("Insert "+e.insert(emp)+ " / "+t+" Success !!!");
			}
			break;
		}
		case 2:{
			int id = in.nextInt();
			String name = in.next();
			String role = in.next();
			String project = in.next();
			emp.setSid(id);
			emp.setName(name);
			emp.setRole(role);
			emp.setProject(project);
			System.out.println("Update"+e.change(emp)+" Success !!!");
			break;
		}
		case 3:{
			int id = in.nextInt();
			System.out.println(e.delete(id)+" row Deleted Successfully!!");
		}
		case 4:{
			int id = in.nextInt();
			Employee employee = e.select(id);
			System.out.println("Employee ID "+employee.getSid());
			System.out.println("Employee Name "+employee.getName());
			System.out.println("Employee Role "+employee.getRole());
			System.out.println("Employee Project "+employee.getProject());
		}
		case 5:{
			List<Employee> res = e.selectAll();
			for(Employee i : res) {
				System.out.println("Sid "+i.getSid()+" Name "+i.getName()+" Role "+i.getRole()+" Project "+i.getProject());
			}
			break;
		}
		}
		
	}

}
