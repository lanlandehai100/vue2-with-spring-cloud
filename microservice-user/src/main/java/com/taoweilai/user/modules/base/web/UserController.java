package com.taoweilai.user.modules.base.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.taoweilai.user.modules.base.entity.User;
import com.taoweilai.user.modules.base.service.Userservice;

@RestController
@RefreshScope
@EnableAutoConfiguration
@RequestMapping(value="user")
public class UserController {

	@Autowired
	private Userservice userService;
	
	@ModelAttribute
	public User get(@RequestParam(required=false) String id){
		if (!StringUtils.isEmpty(id)){
			return userService.get(id);
		}else{
			return new User();
		}
	}
	
	@GetMapping("/{id}")
	public User findById(@PathVariable String id) {
		User findOne = this.userService.get(id);
	    return findOne;
	}
	
}
