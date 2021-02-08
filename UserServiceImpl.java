package com.infy.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.infy.entity.Users;

@Service
public class UserServiceImpl implements UserService {

	List<Users> list=new ArrayList<>();
	
	public UserServiceImpl() {
		list.add(new Users(1,"suchi","suchi@gmail.com"));
		list.add(new Users(2,"bhuma","bhuma@gmail.com"));
		list.add(new Users(3,"abc","abc@gmail.com"));
		list.add(new Users(4,"def","def@gmail.com"));
		list.add(new Users(5,"jack","jack@gmail.com"));
		list.add(new Users(6,"jones","jones@gmail.com"));
		list.add(new Users(7,"charitha","charitha@gmail.com"));
		list.add(new Users(8,"lakshmi","lakshmi@gmail.com"));
		list.add(new Users(9,"shrinkala","shrinkala@gmail.com"));
		list.add(new Users(10,"ram","ram@gmail.com"));
	}
	
	@Override
	public List<Users> getUserDetails() {
		
		return list;
	}

	@Override
	public Users getUserDetails1(Integer userId) {
		
		Users u=null;
		for(Users user:list)
		{
			if(user.getUserId()==userId)
			{
				u=user;
				break;
			}
		}
		return u;
	}

}
