package com.meenal.ib.service.impl;

import com.meenal.ib.dao.UserDao;
import com.meenal.ib.service.UserService;

import user.meenal.ib.model.User;

public class UserServiceImpl implements UserService{

	private final UserDao userDao;

	public UserServiceImpl(UserDao userDao) {
		super();
		this.userDao = userDao;
	}
	@Override
	public void registerUser(User user) {

		
		
//		this.userDao.save(user);
	}

}
