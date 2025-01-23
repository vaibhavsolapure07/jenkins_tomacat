package com.infosys.EmployeeService.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "employee_tb")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empId;
	@NotBlank(message = "empname cannot be null")
	private String empName;
	@NotBlank(message = "empjob cannot be null")
	private String empJob;
	@NotBlank(message = "date of joining cannot be null")
	@Size(min = 10, message = "date of oining must be min of 10 character")
	private String empDateOfJoining;
	@NotNull(message = "empsalary cannot be null")
	@Min(value = 1000, message = "emplary must be greater than 150")
	private int empSalary;
}
