package com.taoweilai.user.modules.base.dao;

import org.apache.ibatis.annotations.Mapper;

import com.taoweilai.user.common.persistence.CrudDao;
import com.taoweilai.user.modules.base.entity.User;

@Mapper
public interface UserDao extends CrudDao<User>{

}
