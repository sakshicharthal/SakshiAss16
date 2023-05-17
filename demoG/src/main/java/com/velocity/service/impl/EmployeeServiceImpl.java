package com.velocity.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.model.PremiumDetail;
import com.velocity.repository.EmployeeRepository;
import com.velocity.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	// inject repository reference
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public PremiumDetail getPremiumDetailById(Integer id) {
		PremiumDetail employee = employeeRepository.findById(id);
		return employee;
	}

}
