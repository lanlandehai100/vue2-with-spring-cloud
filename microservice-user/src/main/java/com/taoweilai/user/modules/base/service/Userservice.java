package com.taoweilai.user.modules.base.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.taoweilai.user.modules.base.dao.UserDao;
import com.taoweilai.user.modules.base.entity.User;

@Service
@Transactional(readOnly=true)
public class Userservice extends ServiceImpl<UserDao, User>{

	public User get(String id) {
		User u = new User();
		u.setId(id);
		return u.selectById();
	}

	public User getByLoginName(String loginName) {
		User u = new User();
		u.setLoginName(loginName);
		EntityWrapper<User> ew = new EntityWrapper<User>();
	    ew.setEntity(u);
	    ew.where("login_name={0}", "'"+loginName+"'");
	    System.out.println(ew.getSqlSegment());
	    u = baseMapper.selectOne(u);
		return u;
	}

}
