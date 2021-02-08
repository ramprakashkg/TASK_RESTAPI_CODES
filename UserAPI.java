package com.infy.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.infy.entity.Users;
import com.infy.service.UserService;

@RestController
public class UserAPI {
	
		@Autowired
		private UserService userService;

		//get user details
		@GetMapping("/users")
		public List<Users> getUserDetails()
		{
			return this.userService.getUserDetails();
		}
		
		//Fetching user details based on userid
		@GetMapping("/users/{userId}")
		public Users getUserDetails1(@PathVariable String userId)
		{
			return this.userService.getUserDetails1(Integer.parseInt(userId));
		}
}
