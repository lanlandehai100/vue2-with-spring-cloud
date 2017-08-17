package com.taogaokao.assessment.modules.Base.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taogaokao.assessment.modules.Base.entity.CtTitle;
import com.taogaokao.assessment.modules.Base.service.CareerPlanningService;

@RestController
@RefreshScope
@EnableAutoConfiguration
@RequestMapping(value="findCtTitle")
public class CareerPlanningController {

	@Autowired
	private CareerPlanningService service;
	
	@GetMapping("/{id}")
	public CtTitle findId(@PathVariable String id){
		CtTitle ctTitle = service.findCtTitle(id);
		return ctTitle;
	}
	
	@GetMapping("/")
	public List<CtTitle> findAllCtTitle(){
		List<CtTitle> ctTitle = service.findAllCtT();
		return ctTitle;
	}
	
}
