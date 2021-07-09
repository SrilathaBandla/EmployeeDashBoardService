package com.cg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cg.entity.EmployeeInfo;

@RestController
public class EmployeeClientController {
	@Autowired
	RestTemplate  restTemplate;
	
	@GetMapping("/employee/{id}")
	public EmployeeInfo getemployeeRecord(@PathVariable int id)
	{
		String url="http://EMPLOYEE-SEARCH:8083/employee/find/"+id;
		return restTemplate.getForObject(url, EmployeeInfo.class);
	}

	@PostMapping("/addEmployee")
	public String addemployeeRecord(@RequestBody EmployeeInfo emp)
	{
		String url="http://EMPLOYEE-SEARCH:8083/addEmployee/";
		return restTemplate.postForObject(url, emp, String.class);
	}


}
