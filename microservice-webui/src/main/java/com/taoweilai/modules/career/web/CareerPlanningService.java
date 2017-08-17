package com.taoweilai.modules.career.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.taoweilai.modules.career.entity.CtTitle;


@Service
public class CareerPlanningService {
	public static final String HASH_ALGORITHM = "SHA-1";
	public static final int HASH_INTERATIONS = 1024;
	public static final int SALT_SIZE = 8;
	
	@Autowired
	private RestTemplate restTemplate;
	
	public CtTitle findById(String id) {
		CtTitle cttitle = this.restTemplate.getForObject("http://assessment/findCtTitle/" + id, CtTitle.class);
		return cttitle;
	}

	public List<CtTitle> findAllList() {
		List<CtTitle> cttitle = (List<CtTitle>)this.restTemplate.getForObject("http://assessment/findCtTitle/", List.class );
		return cttitle;
	}

}
