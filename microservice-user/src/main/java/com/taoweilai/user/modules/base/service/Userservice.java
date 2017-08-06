package com.taoweilai.user.modules.base.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.taoweilai.user.modules.base.entity.User;

@Service
@Transactional(readOnly=true)
public class Userservice {

	public User get(String id) {
		User u = new User();
		u.setId(id);
		return u.selectById();
	}

}
