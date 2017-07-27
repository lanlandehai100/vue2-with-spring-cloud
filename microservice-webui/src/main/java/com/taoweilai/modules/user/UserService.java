package com.taoweilai.modules.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.taoweilai.common.persistence.User;

@Service
public class UserService {

	@Autowired
	private RestTemplate restTemplate;

	public User findById(String id) {
		return this.restTemplate.getForObject("http://user/user/" + id, User.class);
	}
}
