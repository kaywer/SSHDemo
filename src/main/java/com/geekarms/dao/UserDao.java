package com.geekarms.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.geekarms.entity.User;



@Repository
public class UserDao {
	@Autowired
	private SessionFactory sessionFactory;
	
	public User getAllUser(){
		Session session = sessionFactory.getCurrentSession();
		User user = session.find(User.class, 1L);
		return user;
	}

}
