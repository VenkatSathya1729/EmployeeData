package com.employee.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.DAO.EmpData;

@Service
public class EmpService {
	@Autowired
	private EmpData empData;
	public EmpService(EmpData empData) {
		this.empData=empData;
	}
	public List<Map<String,Object>> getAllDetails(){
		return empData.getAllDetails();
	}
	public String insertValues(Map<String,Object> employee) {
		empData.insertValues(employee);
		return "inserted the data";
	}
	public String updateValuesById(int empId,Map<String,Object> employee1) {
		empData.updateValuesById(empId,employee1);
		return "updated the data";
	} 
	public String deleteValuesById(int empId) {
		empData.deleteValusById(empId);
		return "deleted the data";
	}
}
