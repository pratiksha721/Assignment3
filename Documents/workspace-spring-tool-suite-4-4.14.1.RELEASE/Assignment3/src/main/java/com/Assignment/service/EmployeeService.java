package com.Assignment.service;

import java.util.List;

import com.Assignment.model.Employee;

public interface EmployeeService {
	public Employee saveEmployee(Employee employee);

	public List<Employee> getByFirstName(String firstName);


	public void deleteEmployeeDetails(String firstName);

	public void updateEmployeeData(String firstName, Employee employee);


}

