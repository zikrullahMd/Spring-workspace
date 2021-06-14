package com.zikrullah.reference;

public class Student {
	private String name;
	private int rollno;
	private String section;
	Address addr;
	public Student(String name, int rollno, String section, Address addr) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.section = section;
		this.addr = addr;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
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
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + ", section=" + section + ", addr=" + addr + "]";
	}
	
}
   