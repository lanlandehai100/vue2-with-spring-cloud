package com.taoweilai.modules.user;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taoweilai.common.persistence.ClientResp;
import com.taoweilai.common.persistence.User;
import com.taoweilai.common.utils.JwtUtils;

@RestController
//@RequestMapping("/webapi")
public class UserController {
	
	@Autowired
	public UserService userservice;

	@GetMapping("/user/{id}")
	public User findById(@PathVariable String id) {
	  return this.userservice.findById(id);
	}
	
	@GetMapping("/usertest")
	public User find(String id) {
	  return this.userservice.findById(id);
	}
	
	@PostMapping("/login/login")
	public ClientResp<User> login(String username, String password, HttpServletRequest request) {
		username = request.getParameter("username");
		password = request.getParameter("password");
		User findOne = this.userservice.findById("1");
		try {
			String token = JwtUtils.createAndSignToken(findOne);
			findOne.setToken(token);
		} catch (IllegalArgumentException | UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ClientResp<User> resp = new ClientResp<User>("userinfo" , findOne);
	    return resp;
	}
}
