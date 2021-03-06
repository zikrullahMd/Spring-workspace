package com.zikrullah.jdbc.employee.dao;

import java.awt.List;
import java.util.ArrayList;

import com.zikrullah.jdbc.employee.entity.Employee;
import com.zikrullah.springjdbc.entity.Student;

public interface EmployeeInt {
	public int insert(Employee employee);
	public int change(Employee employee);
	public int delete(int id);
	public Employee select(int id);
	public java.util.List selectAll();
}
