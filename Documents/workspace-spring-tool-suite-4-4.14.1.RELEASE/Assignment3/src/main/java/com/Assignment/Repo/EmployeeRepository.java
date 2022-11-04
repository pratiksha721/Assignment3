package com.Assignment.Repo;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Assignment.model.Employee;


@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Serializable>{
	
}
