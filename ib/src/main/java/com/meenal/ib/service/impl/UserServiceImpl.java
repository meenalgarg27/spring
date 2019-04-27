package com.meenal.ib.service.impl;

import com.meenal.ib.dao.GovernmentIdDao;
import com.meenal.ib.dao.UserDao;
import com.meenal.ib.service.UserService;

import user.meenal.ib.model.User;

public class UserServiceImpl implements UserService{

	private final UserDao userDao;
	private final GovernmentIdDao governmentIdDao;

	public UserServiceImpl(UserDao userDao, GovernmentIdDao governmentIdDao) {
		super();
		this.userDao = userDao;
		this.governmentIdDao = governmentIdDao;
	}
	@Override
	public void registerUser(User user) {

		
		
		
//		this.userDao.save(user);
	}

}
