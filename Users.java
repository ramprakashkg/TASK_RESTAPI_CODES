package com.infy.entity;

public class Users {
	
	private Integer userId;
	private String name;
	private String emailId;
	public Users(Integer userId, String name, String emailId) {
		super();
		this.userId = userId;
		this.name = name;
		this.emailId = emailId;
	}
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Users [userId=" + userId + ", "+ "name=" + name + ", "+ "emailId=" + emailId + "]";
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	

}
