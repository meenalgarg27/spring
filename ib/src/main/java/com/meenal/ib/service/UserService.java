package com.meenal.ib.service;

import org.springframework.stereotype.Service;

import user.meenal.ib.model.InitialVerificationResponse;
import user.meenal.ib.model.User;

@Service
public interface UserService {

	public InitialVerificationResponse registerUser(User user);

}
