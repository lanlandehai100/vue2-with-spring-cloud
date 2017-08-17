package com.taoweilai.common.utils.bussiness;

import org.springframework.security.core.context.SecurityContextHolder;

import com.taoweilai.common.persistence.Principal;
import com.taoweilai.common.persistence.User;
import com.taoweilai.common.utils.ApplicationContextHolder;
import com.taoweilai.modules.user.UserService;

public class UserUtils {
	
	public static final UserService userservice = ApplicationContextHolder.getBean(UserService.class);
	
	public static User getUser(){
		return getPrincial();
	}


	private static User getPrincial() {
//		Principal principal = (Principal) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		String loginName = (String) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		return getUserByLoginName(loginName);
	}

	public static User getUserByLoginName(String loginName) {
		return userservice.findUserByLoginName(loginName);
	}

}
