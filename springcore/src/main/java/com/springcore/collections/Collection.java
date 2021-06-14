package com.springcore.collections;

import java.util.*;

public class Collection {
	private String name;
	private List<String> phone;
	private Set<String> addr;
	private Map<String,String> courses;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getPhone() {
		return phone;
	}
	public void setPhone(List<String> phone) {
		this.phone = phone;
	}
	public Set<String> getAddr() {
		return addr;
	}
	public void setAddr(Set<String> addr) {
		this.addr = addr;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	public Collection(String name, List<String> phone, Set<String> addr, Map<String, String> courses) {
		super();
		this.name = name;
		this.phone = phone;
		this.addr = addr;
		this.courses = courses;
	}
	public Collection() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
