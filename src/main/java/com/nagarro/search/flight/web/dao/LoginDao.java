package com.nagarro.search.flight.web.dao;

import java.util.List;

import com.nagarro.search.flight.web.pojo.User;

public interface LoginDao {

	public List<User> getUsersList(User user);
}
