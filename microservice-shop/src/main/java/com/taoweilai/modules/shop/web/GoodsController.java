package com.taoweilai.modules.shop.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taoweilai.modules.shop.entity.Goods;
import com.taoweilai.modules.shop.service.GoodsService;

@RestController
@RequestMapping("/goods")
public class GoodsController {
	
	@Autowired
	public GoodsService goodsservice;

	@GetMapping("/{id}")
	public Goods findById(@PathVariable String id) {
	  return this.goodsservice.findById(id);
	}
	
	@GetMapping("create")
	public String createGoods(){
		Goods g = new Goods();
		g.setName("Ã‘∏ﬂøº");
		g.setPrice(50.5);
		g.setServiceName("taogaokao");
		g.setSku(10);
		this.goodsservice.createGoods(g);
		return "success";
	}
}
