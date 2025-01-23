package com.infosys.EmployeeService.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.EmployeeService.DAO.EmployeeRepository;
import com.infosys.EmployeeService.Exception.EmployeeException;
import com.infosys.EmployeeService.Model.Employee;
import com.infosys.ProjectService.Exception.ProjectException;

@Service
public class EmployeeService implements EmployeeServiceInterface{

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public Employee addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		
			return employeeRepository.save(emp);
		
	}

	@Override
	public List<Employee> showAllEmployees() {
		// TODO Auto-generated method stub
		
		return employeeRepository.findAll();
	}

	@Override
	public Employee showEmployeeById(int id) {
		// TODO Auto-generated method stub
		return employeeRepository.findById(id).get();
	}

	@Override
	public List<Employee> showEmployeeByDoj(String doj) {
		// TODO Auto-generated method stub
		return employeeRepository.findEmployeesByDoj(doj);
	}

}
