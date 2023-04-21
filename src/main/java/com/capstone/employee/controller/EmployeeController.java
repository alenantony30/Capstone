package com.capstone.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capstone.employee.entity.Employee;
import com.capstone.employee.exception.InvalidEmployeeException;
import com.capstone.employee.service.IEmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	IEmployeeService employeeService;

	@GetMapping("/get/by/{ID}")
	public Employee getEmployeeByID(@PathVariable int ID) throws InvalidEmployeeException {
		return employeeService.getEmployeeById(ID);
	}

}
