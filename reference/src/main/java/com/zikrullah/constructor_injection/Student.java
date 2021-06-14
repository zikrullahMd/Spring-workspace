package com.zikrullah.constructor_injection;

public class Student {
	private String name;
	private int id;
	
	public Student(String name, int id) {
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}
	
	
}
