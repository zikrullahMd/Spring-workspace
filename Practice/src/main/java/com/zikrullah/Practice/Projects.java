package com.zikrullah.Practice;
import java.util.*;
public class Projects {
	private String proname;
	private String domain;
	private ArrayList<String> technologies;
	public Projects() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Projects(String proname, String domain, ArrayList<String> technologies) {
		super();
		this.proname = proname;
		this.domain = domain;
		this.technologies = technologies;
	}
	public String getProname() {
		return proname;
	}
	public void setProname(String proname) {
		this.proname = proname;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public ArrayList<String> getTechnologies() {
		return technologies;
	}
	
	public void setTechnologies(ArrayList<String> technologies) {
		this.technologies = technologies;
	}
	@Override
	public String toString() {
		return "Projects [proname=" + proname + ", domain=" + domain + ", technologies=" + technologies + "]";
	}
	
	
	
}
