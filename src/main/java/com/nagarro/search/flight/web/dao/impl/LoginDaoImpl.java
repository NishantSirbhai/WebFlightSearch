package com.nagarro.search.flight.web.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.nagarro.search.flight.web.dao.LoginDao;
import com.nagarro.search.flight.web.pojo.User;

@Repository
public class LoginDaoImpl implements LoginDao {
	@Autowired
	private SessionFactory sessionFactory;

	@Transactional
	public List<User> getUsersList(User user) {
		List<User> usersList = new ArrayList<User>();

		usersList = sessionFactory.getCurrentSession()
				.createQuery("FROM User U where U.username=:username and U.password=:password", User.class)
				.setParameter("username", user.getUsername()).setParameter("password", user.getPassword()).list();
		return usersList;
	}
}