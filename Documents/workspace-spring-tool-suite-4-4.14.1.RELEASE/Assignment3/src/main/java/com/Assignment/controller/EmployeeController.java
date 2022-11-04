package com.Assignment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Assignment.model.Employee;
import com.Assignment.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;



	@PostMapping("/emp")
	public ResponseEntity<Employee> saveEmp(@RequestBody Employee emp){
		return new ResponseEntity<Employee>(employeeService.saveEmployee(emp),HttpStatus.OK);
	}
	@GetMapping("/firstNm")
	public ResponseEntity<List<Employee>> findEmployeeUsingfirstName(String firstName){
		return new ResponseEntity<List<Employee>>(employeeService.getByFirstName(firstName),HttpStatus.OK);
		
	}
	@DeleteMapping("/emp/{name}")
	public ResponseEntity<String> delete(@PathVariable String FirstName)
	{
		employeeService.deleteEmployeeDetails(FirstName);
		return new ResponseEntity<String>("Employee succesfully deleted ",HttpStatus.OK);	
	}
	@PutMapping("/updateEmp/{name}")
	public ResponseEntity<Employee> updateEmployeeData(@PathVariable String firstName, @RequestBody Employee employee)
	{
		employeeService.updateEmployeeData(firstName,employee);
		return new ResponseEntity<Employee>(HttpStatus.OK);
		
	}
	

}
