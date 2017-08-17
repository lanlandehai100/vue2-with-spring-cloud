package com.taoweilai.modules.login.web;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@EnableAutoConfiguration
public class LoginController {
	
	@GetMapping("gologin")
	public String gologin(){
		return "login/login.html";
	}
	
	@GetMapping("goregister")
	public String goregister(){
		return "login/register.html";
	}
	
}
