package com.capstone.employee.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.capstone.employee.entity.Employee;
import com.capstone.employee.exception.InvalidEmployeeException;

@SpringBootTest
class EmployeeServiceTest {

	@Autowired
	EmployeeService service;

	@Test
	void testGetEmployeeById() throws InvalidEmployeeException {

		Employee employee = service.getEmployeeById(101);
		assertEquals("John Smith", employee.getEmployeeName());
	}

	@Test
	public void testGetInvalidEmployeeById() throws InvalidEmployeeException {

		assertThrows(InvalidEmployeeException.class, () -> service.getEmployeeById(1010));
	}

}