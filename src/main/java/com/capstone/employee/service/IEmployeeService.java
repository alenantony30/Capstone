package com.capstone.employee.service;

import com.capstone.employee.entity.Employee;
import com.capstone.employee.exception.InvalidEmployeeException;

public interface IEmployeeService {
	
	public Employee getEmployeeById(int ID) throws InvalidEmployeeException;

}
