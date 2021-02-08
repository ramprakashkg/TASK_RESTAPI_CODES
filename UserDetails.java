package com.example.demoproject;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

//@Component
public class UserDetails {
	private int userID;
	private String name;
	private String emailID;
	public UserDetails(int userID, String name, String emailID) {
		this.userID = userID;
		this.name = name;
		this.emailID = emailID;
	}
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	
}

