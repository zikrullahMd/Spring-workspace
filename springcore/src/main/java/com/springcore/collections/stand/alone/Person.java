package com.springcore.collections.stand.alone;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;

public class Person {
	private String name;
	private int age;
	@Autowired
	private List<String> friends;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public List<String> getFriends() {
		return friends;
	}
	public void setFriends(List<String> friends) {
		this.friends = friends;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", friends=" + friends + "]";
	}
	
	
}



