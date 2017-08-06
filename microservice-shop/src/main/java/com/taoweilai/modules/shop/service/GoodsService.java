package com.taoweilai.modules.shop.service;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.taoweilai.modules.shop.entity.Goods;

@Service
@Transactional(readOnly=true)
public class GoodsService {
	public Goods findById(String id) {
		Goods g = new Goods();
		g.setId(id);
		g = g.selectById();
		return g;
	}
	@Transactional(readOnly=false)
	public Boolean createGoods(Goods g){
		return g.insert();
	}
}
