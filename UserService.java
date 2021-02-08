package com.infy.service;

import java.util.List;

import com.infy.entity.Users;

public interface UserService {

	public List<Users> getUserDetails();

	public Users getUserDetails1(Integer userId);
}
