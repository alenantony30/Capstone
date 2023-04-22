package com.capstone.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capstone.employee.entity.Employee;
import com.capstone.employee.exception.InvalidEmployeeException;
import com.capstone.employee.service.IEmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	 private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);
	
	@Autowired
	IEmployeeService employeeService;

	@GetMapping("/get/by/{ID}")
	public Employee getEmployeeByID(@PathVariable int ID) throws InvalidEmployeeException {
		 logger.info("getEmployeeByID("+ID+") is called ");
		return employeeService.getEmployeeById(ID);
	}

}
