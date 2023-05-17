package com.velocity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.velocity.model.PremiumDetail;
import com.velocity.service.EmployeeService;

@RestController
public class EmployeeController {

	// inject service
	@Autowired
	private EmployeeService employeeService;

	// Design the Restful web service to fetch the employee data based on id
	@GetMapping("/fetch/{id}")
	public ResponseEntity<PremiumDetail> getEmployeeById(@PathVariable("id") Integer id) { //id contain 2
		// calling method
		PremiumDetail emp = employeeService.getPremiumDetailById(id); //2
		return ResponseEntity.ok().body(emp);
	}

}
