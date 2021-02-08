package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.EmpDetail;

@Service
public class EmpServicesimpl implements EmpServices {

	List<EmpDetail> list;
	
	
	public  EmpServicesimpl() {
		list=new ArrayList<>();
		list.add(new EmpDetail(1,"Shrinkhala","akiraa2345@gmail.com"));
		list.add(new EmpDetail(2,"Shree","shree12345@gmail.com"));
		list.add(new EmpDetail(3,"Aniket","aniket12345@gmail.com"));
	}

	@Override
	public List<EmpDetail> getEmpDetails() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public EmpDetail getEmpDetails(long empid) {
		EmpDetail e=null;
		for(EmpDetail emp:list)
		{
			if(emp.getUserid()==empid) {
				e=emp;
				break;
			}
		}
		return e;
	}

	@Override
	public EmpDetail addEmpDetail(EmpDetail emp) {
		list.add(emp);
		// TODO Auto-generated method stub
		return emp;
	}

	

}
