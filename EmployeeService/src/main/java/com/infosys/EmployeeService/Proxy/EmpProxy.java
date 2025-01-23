package com.infosys.EmployeeService.Proxy;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.infosys.ProjectService.Model.Project;

@FeignClient(name = "Project-Service")
public interface EmpProxy {

	@GetMapping("/projectservice/showprojectsbyempid/{empid}")
	public List<Project> getProjectsByEmpId(@PathVariable int empid);
}
