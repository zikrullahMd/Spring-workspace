package com.zikrullah.springjdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.zikrullah.springjdbc.entity.Student;

public class StudentDaoImp implements StudentDao{

	private JdbcTemplate jdbcTemplate;
	
	public int insert(Student student) {
		// TODO Auto-generated method stub
		 String query = "INSERT INTO student(sid,name,address) VALUES (?,?,?)";
		 int r = this.jdbcTemplate.update(query,student.getSid(),student.getName(),student.getAddress());
		 return r;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
