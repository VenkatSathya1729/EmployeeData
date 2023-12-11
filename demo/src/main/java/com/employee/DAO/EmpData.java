package com.employee.DAO;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class EmpData {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	public EmpData(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate=jdbcTemplate;
	}
	public List<Map<String,Object>> getAllDetails(){
		return jdbcTemplate.queryForList("select * from EmpTable");
	}
	public void insertValues(Map<String,Object> employee) {
		jdbcTemplate.update("insert into EmpTable values(?,?,?,?)",employee.get("empId"),employee.get("empName"),employee.get("role"),employee.get("state"));
	}
	public void updateValuesById(int empId,Map<String,Object> employee1) {
		jdbcTemplate.update("update Emptable set empName=? where empId=?",employee1.get("empName"),empId);
	}
	public void deleteValusById(int empId) {
		jdbcTemplate.update("delete from EmpTable where empId=?",empId);
	}
}
