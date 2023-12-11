package com.employee.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.service.EmpService;

@RestController
public class EmpController {
	@Autowired
	private EmpService empService;
	public EmpController(EmpService empService) {
		this.empService=empService;
	}
	@GetMapping("/emp")
	public List<Map<String,Object>> getAllDetails(){
		return empService.getAllDetails();
	}
	@PostMapping("/emp1")
	public String insertValues(@RequestBody Map<String,Object> employee) {
		return empService.insertValues(employee);
	}
	@PutMapping("/emp2/{empId}")
	public String updateValuesById(@PathVariable("empId") int empId,@RequestBody Map<String,Object> employee1) {
		return empService.updateValuesById(empId,employee1);
	}
	@DeleteMapping("/emp3/{empId}")
	public String deleteValuesById(@PathVariable("empId") int empId) {
		return empService.deleteValuesById(empId);
	}
}
