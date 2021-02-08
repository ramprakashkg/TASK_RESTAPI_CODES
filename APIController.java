package com.example.demoproject;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/task/")
public class APIController {
	@Autowired
	private UserDetailImpl userDetailsImpl;
	
	@GetMapping(value="/home")
	public String value() {
		return "Hello";
	}
	@GetMapping(value= "/details")
	public List<UserDetails> getDetail() {
		return this.userDetailsImpl.getDetail();
	}

	@GetMapping(value= "/details/{userid}")
	public UserDetails getDetails(@PathVariable int userid) {
		return this.userDetailsImpl.getDetails(userid);
	}
	@PostMapping(value= "/post")
	public List<UserDetails> postDetails(@RequestParam("userID") int userid,@RequestParam("name") String name,@RequestParam("emailID") String emailid) {
		return this.userDetailsImpl.postDetail(userid,name,emailid);
	}
}
