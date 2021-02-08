package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.EmpDetail;
import com.springrest.springrest.services.EmpServices;

@RestController
public class MyController {
	@Autowired
	private EmpServices empservices;
	
	@GetMapping("/user")
	public String User()
	{
		return "User is present";
	}
	
	
	@GetMapping("/Empdetails")
	public List<EmpDetail> getEmpDetails()
	{
		return this.empservices.getEmpDetails();
	}
	
	@GetMapping("/Empdetails/{empid}")
	public EmpDetail getEmpdetail(@PathVariable String empid)
	{
		
		return this.empservices.getEmpDetails(Long.parseLong(empid));
	}
	
	@PostMapping("/Empdetails")
	public EmpDetail addEmpDetails(@RequestBody EmpDetail emp)
	{
		return this.empservices.addEmpDetail(emp);
		
	}
	
	
	
	
	
	
	
	
	
	
	
}

