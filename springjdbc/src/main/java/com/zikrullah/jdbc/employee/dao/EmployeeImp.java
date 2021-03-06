package com.zikrullah.jdbc.employee.dao;

import java.awt.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.zikrullah.jdbc.employee.entity.Employee;
import com.zikrullah.springjdbc.entity.Student;

public class EmployeeImp implements EmployeeInt{
	
	JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int insert(Employee e) {
		// TODO Auto-generated method stub
		
		String query = "INSERT INTO employee(eid,name,role,projects) VALUES(?,?,?,?);";
		int r = this.jdbcTemplate.update(query,e.getSid(),e.getName(),e.getRole(),e.getProject());
		
		return r;
	}
	
	public int change(Employee e) {
		String query = "UPDATE employee SET name = ?, role = ? , projects = ? WHERE eid = ?";
		
		int r = this.jdbcTemplate.update(query,e.getName(),e.getRole(),e.getProject(),e.getSid());
	
		return r;
	}
	
	public int delete(int id) {
		String query = "DELETE FROM employee WHERE eid = ?";
		int r = this.jdbcTemplate.update(query,id);
		return r;
	}

	public Employee select(int id) {
		String query = "SELECT * FROM employee WHERE eid = ?";
		RowMapper<Employee> rowMapper = new rowMapper();
		Employee employee = this.jdbcTemplate.queryForObject(query, rowMapper,id);
		return employee;
	}
	
	public java.util.List selectAll(){
		java.util.List list = new ArrayList();
		
		String query = "SELECT * FROM employee";
		list = jdbcTemplate.query(query, new RowMapper(){

			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				Employee e = new Employee();
				e.setSid(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setRole(rs.getString(3));
				e.setProject(rs.getString(4));
				return e;
			}
			
		});
		return list;
	}
	
	
}

class rowMapper implements RowMapper<Employee>{

	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee e = new Employee();
		
		e.setSid(rs.getInt(1));
		e.setName(rs.getString(2));
		e.setRole(rs.getString(3));
		e.setProject(rs.getString(4));
		return e;
	}
	
}




