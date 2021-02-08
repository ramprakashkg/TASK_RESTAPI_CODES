package com.springrest.springrest.entities;

public class EmpDetail {
	
	private long Userid;
	private String Username;
	private String Email;
	public EmpDetail() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmpDetail(long userid, String username, String email) {
		super();
		Userid = userid;
		Username = username;
		Email = email;
	}
	public long getUserid() {
		return Userid;
	}
	public void setUserid(long userid) {
		Userid = userid;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	@Override
	public String toString() {
		return "EmpDetail [Userid=" + Userid + ", Username=" + Username + ", Email=" + Email + "]";
	}
	

}
