package com.nagarro.search.flight.web.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.search.flight.web.dao.LoginDao;
import com.nagarro.search.flight.web.pojo.User;
import com.nagarro.search.flight.web.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {
	@Autowired
	LoginDao loginDao;

	public boolean authenticateUser(User user) {
		boolean result = false;
		List<User> matchingUsers = new ArrayList<User>();
		matchingUsers = loginDao.getUsersList(user);
		if (!matchingUsers.isEmpty()) {
			result = true;
		}
		return result;
	}
}
