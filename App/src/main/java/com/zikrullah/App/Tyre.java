package com.zikrullah.App;
import java.util.*;

public class Tyre {
	private String brand;
	
	public Tyre(String brand) {
		super();
		this.brand = brand;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		return "Tyre [brand=" + brand + "]";
	}
}