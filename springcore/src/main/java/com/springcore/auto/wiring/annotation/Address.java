package com.springcore.auto.wiring.annotation;

public class Address {
	private int houseNo;
	private String area;
	private String city;
	public int getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(int houseNo, String area, String city) {
		super();
		this.houseNo = houseNo;
		this.area = area;
		this.city = city;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", area=" + area + ", city=" + city + "]";
	}
	
	
	
}
