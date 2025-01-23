package com.infosys.EmployeeService.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.infosys.EmployeeService.Model.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	@Query("select e from Employee e where e.empDateOfJoining = ?1")
	public List<Employee> findEmployeesByDoj(String doj);
}
