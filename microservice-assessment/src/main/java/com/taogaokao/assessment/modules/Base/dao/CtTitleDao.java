package com.taogaokao.assessment.modules.Base.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.taogaokao.assessment.modules.Base.entity.CtTitle;

@Mapper
public interface CtTitleDao extends CrudDao<CtTitle>{

	CtTitle get(String id);

	List<CtTitle> findALL();
	
}
