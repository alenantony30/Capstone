package com.capstone.employee.service;

import com.capstone.employee.vo.EmployeeVO;

public interface IEmployeeService {
	
	public EmployeeVO getEmployeeById(int ID) throws Exception;

}
