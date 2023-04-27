package com.capstone.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.capstone.employee.service.EmployeeService;
import com.capstone.employee.service.IEmployeeService;

@SpringBootApplication
public class EmployeeManagementSystemApplication {

	
	
	
	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementSystemApplication.class, args);
		IEmployeeService employeeService=new EmployeeService();
		System.out.println(employeeService.getEmployees());
		
	}

}
