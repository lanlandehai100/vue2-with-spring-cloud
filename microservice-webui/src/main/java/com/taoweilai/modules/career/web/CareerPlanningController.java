package com.taoweilai.modules.career.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.alibaba.fastjson.JSON;
import com.taoweilai.modules.career.entity.CtTitle;

@Controller
public class CareerPlanningController {

	@Autowired
	private CareerPlanningService service;
	
	@GetMapping("career/careerPlanning")
	public String careerPlanning(Model model){
		List<CtTitle> ctTitleList = service.findAllList();
		model.addAttribute("ctTitle", ctTitleList);
		return "career/careerPlanning.html";
	}
	
	@GetMapping("career/question/{id}")
	public String GetTest(@PathVariable String id,Model model , HttpServletRequest req){
		CtTitle ctTitle = service.findById(id);
		model.addAttribute("ctTitle", ctTitle);
		model.addAttribute("data", JSON.toJSONString(ctTitle));
		return "career/question.html";
	}
	
	@GetMapping("career/result")
	public String Test(){
		return "career/result.html";
	}
	
	@GetMapping("career/resultTotal")
	public String Test1(){
		return "career/resultTotal.html";
	}
	
}
