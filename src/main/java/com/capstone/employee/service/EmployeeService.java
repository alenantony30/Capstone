package com.capstone.employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capstone.employee.entity.Employee;
import com.capstone.employee.exception.InvalidEmployeeException;
import com.capstone.employee.repository.IEmployeeRepository;

@Service
public class EmployeeService implements IEmployeeService {

	@Autowired
	IEmployeeRepository employeeRepository;

	@Override
	public Employee getEmployeeById(int ID) throws InvalidEmployeeException {

		Employee employee = employeeRepository.findById(ID).orElse(null);
		if (employee != null)
			return employee;
		else
			throw new InvalidEmployeeException("Invalid EmployeeID");
	}

}
