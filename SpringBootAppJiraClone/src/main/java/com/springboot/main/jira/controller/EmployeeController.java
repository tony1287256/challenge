package com.springboot.main.jira.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.main.jira.exception.InvalidIdException;
import com.springboot.main.jira.model.Employee;
import com.springboot.main.jira.model.EmployeeProject;
import com.springboot.main.jira.model.Project;
import com.springboot.main.jira.model.User;
import com.springboot.main.jira.service.EmployeeProjectService;
import com.springboot.main.jira.service.EmployeeService;
import com.springboot.main.jira.service.ProjectService;
import com.springboot.main.jira.service.UserService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	@Autowired
	private ProjectService projectService;
	@Autowired
	private EmployeeProjectService employeeProjectService;
	@Autowired
	private UserService userService;
	
	@Autowired
	private PasswordEncoder passwordEncoder;

	@PostMapping("/add") // --> /employee/add
	public Employee insertEmployee(@RequestBody Employee employee) {
		
		//save user info in db//
		User user = employee.getUser();
		//I am encrypting the password//
		String passwordPlain = user.getPassword();
		String encodedPassword = passwordEncoder.encode(passwordPlain);
		user.setPassword(encodedPassword);
		
		user.setRole("EMPLOYEE");
		user=userService.insert(user);
		
		//Attach the save user (in step 1) t employee//
		employee.setUser(user);
		
		//save employee in DB//
		
		return employeeService.insert(employee);
	}

	@PostMapping("/project/add/{eid}/{pid}")
	public ResponseEntity<?> assignProject(@PathVariable("eid") int eid, @PathVariable("pid") int pid,
			@RequestBody EmployeeProject employeeProject) {
		try {
			Employee employee = employeeService.getById(eid);
			Project project = projectService.getByid(pid);
			employeeProject.setEmployee(employee);
			employeeProject.setProject(project);
			employeeProject = employeeProjectService.insert(employeeProject);
			return ResponseEntity.ok().body(employeeProject);
		} catch (InvalidIdException e) {
			return ResponseEntity.badRequest().body(e.getMessage());
		}
	}
}