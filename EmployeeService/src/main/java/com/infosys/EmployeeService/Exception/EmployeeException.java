package com.infosys.EmployeeService.Exception;

@SuppressWarnings("serial")
public class EmployeeException extends RuntimeException{

	public EmployeeException() {
		super();
	}
	
	public EmployeeException(int empId) {
		super("Unable to Find a Employee with empId: " + empId);
	}
}
