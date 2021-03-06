package com.sample.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.dao.UserDaoService;
import com.sample.model.User;
import com.sample.services.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDaoService userDAO;

	@Override
	public List<User> retriveAll() {
		return userDAO.findAll();
	}

	@Override
	public User saveUser(User user) {
		return userDAO.save(user);
	}

	@Override
	public User retriveOne(int id) {
		return userDAO.findOne(id);
	}
	
	@Override
	public User retrivebyName(String name) {
		return userDAO.findbyName(name);
	}

	@Override
	public User deleteUser(int id) {
		return userDAO.deleteById(id);
	}
	
}
