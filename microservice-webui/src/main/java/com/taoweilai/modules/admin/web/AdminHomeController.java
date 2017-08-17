package com.taoweilai.modules.admin.web;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@EnableAutoConfiguration
public class AdminHomeController {
	
	@GetMapping("/admin")
	public String home(){
		return "home/index.html";
	}
}
