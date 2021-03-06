package com.springcore.auto.wiring;

public class Employee {
	private String name;
	private int eid;
	private Address addr;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	public Employee(String name, int eid, Address addr) {
		super();
		this.name = name;
		this.eid = eid;
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", eid=" + eid + ", addr=" + addr + "]";
	}
	
	
}
