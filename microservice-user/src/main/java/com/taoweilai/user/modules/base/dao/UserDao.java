package com.taoweilai.user.modules.base.dao;

import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.taoweilai.user.modules.base.entity.User;

@Mapper
public interface UserDao extends BaseMapper<User>{

}
