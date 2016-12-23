package com.geekarms.service;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.geekarms.dao.UserDao;
import com.geekarms.entity.User;

@Service
@Transactional
public class UserService {
	@Autowired
	private UserDao userDao;
	
	public User getAllUser(){
		return userDao.getAllUser();
	}
}
