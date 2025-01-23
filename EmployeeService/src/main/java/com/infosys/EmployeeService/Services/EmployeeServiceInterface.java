package com.infosys.EmployeeService.Services;

import java.util.List;

import com.infosys.EmployeeService.Model.Employee;

public interface EmployeeServiceInterface {

	public Employee addEmployee(Employee emp);
	
	public List<Employee> showAllEmployees();
	
	public Employee showEmployeeById(int id);
	
	public List<Employee> showEmployeeByDoj(String doj);
}
