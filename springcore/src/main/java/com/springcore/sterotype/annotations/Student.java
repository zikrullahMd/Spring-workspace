package com.springcore.sterotype.annotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
@Scope("prototype")
public class Student {
	@Value("Zikrullah")
	private String name;
	@Value("#{ T(Math).sqrt(10000) }")	// Spring Expression Language
	private int rollno;
	@Value("#{ new String('Hyderabad') }")
	private String city;
	
	@Value("#{projects}")
	private LinkedList<String> projects;
	
	
	public LinkedList<String> getProjects() {
		return projects;
	}
	public void setProjects(LinkedList<String> projects) {
		this.projects = projects;
	}
	public Student() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + ", city=" + city + "]";
	}
}
