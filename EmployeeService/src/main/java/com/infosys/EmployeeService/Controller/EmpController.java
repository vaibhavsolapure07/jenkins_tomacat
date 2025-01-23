package com.infosys.EmployeeService.Controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.infosys.EmployeeService.Model.Employee;
import com.infosys.EmployeeService.Proxy.EmpProxy;
import com.infosys.EmployeeService.Services.EmployeeService;
import com.infosys.ProjectService.Model.Project;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/employeeservice")
public class EmpController {

	@Autowired
	EmployeeService empService;

	@Autowired
	EmpProxy empProxy;
	
	@GetMapping("/homepage")
	public String homePage() {
		return "Welcome to Employee Service";
	}
	
	@GetMapping("/ShowAll")
	public List<Employee> showAllEmployees() {
		return empService.showAllEmployees();
	}
	
	@PostMapping("/addemp")
	public Employee addEmployee(@Valid @RequestBody Employee emp) {
		return empService.addEmployee(emp);
	}
	
	@GetMapping("/showbyid/{id}")
	public Employee showEmpById(@PathVariable int id) {
		return empService.showEmployeeById(id);
	}
	
	@GetMapping("/showbydoj/{doj}")
	public List<Employee> showEmpByDoj(@PathVariable String doj) {
		return empService.showEmployeeByDoj(doj);
	}
	
	@GetMapping("/showprojects/{empid}")
	public List<Project> findProjectsByEmpId(@PathVariable int empid) {
		return empProxy.getProjectsByEmpId(empid);
	}
}
