package com.zikrullah.jdbc.employee.entity;

public class Employee {
	
	private int eid;
	private String name;
	private String role;
	private String project;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getSid() {
		return eid;
	}
	public void setSid(int sid) {
		this.eid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}
	

}
