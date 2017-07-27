package com.taoweilai.modules.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.taoweilai.common.persistence.User;

@RestController
public class UserController {
	
	@Autowired
	public UserService userservice;

	@GetMapping("/user/{id}")
	public User findById(@PathVariable String id) {
	  return this.userservice.findById(id);
	}
	
	@GetMapping("/login/login")
	public User login(@RequestParam String id) {
		User findOne = this.userservice.findById("1");
	    return findOne;
	}
}
