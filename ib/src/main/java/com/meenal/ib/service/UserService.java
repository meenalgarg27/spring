package com.meenal.ib.service;

import user.meenal.ib.model.InitialVerificationResponse;
import user.meenal.ib.model.User;

public interface UserService {

	public InitialVerificationResponse registerUser(User user);
	

}
