package com.zikrullah.springcore;

public class Student {
	private int id;
	private String name;
	private String addr;
	
	//Constructor for constructor type dependency injection
	public Student(int id, String name, String addr) {
		super();
		this.id = id;
		this.name = name;
		this.addr = addr;
	}
	
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}



	// Setter and Getter for Setter type Dependency Injectioni
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}



	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", addr=" + addr + "]";
	}
	
	
}
