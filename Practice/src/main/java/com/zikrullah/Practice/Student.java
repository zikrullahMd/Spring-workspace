package com.zikrullah.Practice;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	private String name;
	private int rollNo;
	@Autowired
	private Projects projects;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, int rollNo, Projects projects) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.projects = projects;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public Projects getProjects() {
		return projects;
	}
	public void setProjects(Projects projects) {
		this.projects = projects;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + ", projects=" + projects + "]";
	}
	
	
	
}
