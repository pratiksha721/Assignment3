package com.Assignment.serviceImpl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Assignment.Repo.EmployeeRepository;
import com.Assignment.model.Employee;
import com.Assignment.service.EmployeeService;


@Service
public class EmployeeServiceImpl implements EmployeeService {

	private static final Logger logger = LoggerFactory.getLogger(EmployeeServiceImpl.class);

	@Autowired
	private EmployeeRepository repo;

	@Override
	public Employee saveEmployee(Employee employee) {
		logger.info("Employee Service Implementation : savePolicy() method");
		return repo.save(employee);
	}

	@Override
	public List<Employee> getByFirstName(String firstName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteEmployeeDetails(String firstName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateEmployeeData(String firstName, Employee employee) {
		// TODO Auto-generated method stub
		
	}
}