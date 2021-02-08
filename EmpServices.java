package com.springrest.springrest.services;

import java.util.List;

import com.springrest.springrest.entities.EmpDetail;

public interface EmpServices {
	
	public List<EmpDetail> getEmpDetails();

	public EmpDetail getEmpDetails(long empid);

	public EmpDetail addEmpDetail(EmpDetail emp);

	
}
