package com.taoweilai.user.modules.base.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.taoweilai.user.common.persistence.CrudService;
import com.taoweilai.user.modules.base.dao.UserDao;
import com.taoweilai.user.modules.base.entity.User;

@Service
@Transactional(readOnly=true)
public class Userservice extends CrudService<UserDao, User> {

}
