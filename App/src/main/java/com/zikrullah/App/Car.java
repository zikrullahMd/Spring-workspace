package com.zikrullah.App;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle{
	public void running() {
		System.out.println("The car is running");
	}
}
