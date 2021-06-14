package com.zikrullah.reference;

public class Address {
	private int house_no;
	private String locality;
	private String city;
	private String state;
	private String country;
	public Address(int house_no, String locality, String city, String state, String country) {
		super();
		this.house_no = house_no;
		this.locality = locality;
		this.city = city;
		this.state = state;
		this.country = country;
	}
	public int getHouse_no() {
		return house_no;
	}
	public void setHouse_no(int house_no) {
		this.house_no = house_no;
	}
	public String getlocality() {
		return locality;
	}
	public void setlocality(String locality) {
		this.locality = locality;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [house_no=" + house_no + ", locality=" + locality + ", city=" + city + ", state=" + state
				+ ", country=" + country + "]";
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
	
}
