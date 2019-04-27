package com.meenal.ib.service;

import org.springframework.stereotype.Service;

import user.meenal.ib.model.User;

@Service
public interface UserService {

	public void registerUser(User user);

}
