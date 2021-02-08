package com.example.demoproject;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class UserDetailImpl {

	List<UserDetails> listone = new ArrayList<>();
	public UserDetailImpl() {
		listone.add(new UserDetails(123,"Ram","ram@gmail.com"));
		listone.add(new UserDetails(124,"prakash","prakash@gmail.com"));
		listone.add(new UserDetails(125,"subash","subash@gmail.com"));
		listone.add(new UserDetails(126,"kriti","kriti@gmail.com"));
		listone.add(new UserDetails(127,"suresh","suresh@gmail.com"));
	}
	public UserDetails getDetails(int userID) {
		//implementaions pending
		UserDetails result = null;
		for(UserDetails i:listone) {
			if(i.getUserID()==userID) {
				result=i;
				break;
			}
		}
		return result;
	}
	public List<UserDetails> getDetail() {
		return listone;
	}
	public List<UserDetails> postDetail(int userid,String name,String emailid) {
		listone.add(new UserDetails(userid,name,emailid));
		return listone;
	}
}
