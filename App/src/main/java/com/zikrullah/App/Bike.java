package com.zikrullah.App;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle{
	public void running() {
		System.out.println("The bike is running");
	}
}
