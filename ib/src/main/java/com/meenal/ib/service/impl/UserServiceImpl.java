package com.meenal.ib.service.impl;

import com.meenal.ib.dao.GovernmentIdDao;
import com.meenal.ib.dao.ProcessDao;
import com.meenal.ib.dao.UserDao;
import com.meenal.ib.entities.ProcessEntity;
import com.meenal.ib.enums.IbProcess;
import com.meenal.ib.service.UserService;

import user.meenal.ib.model.Error;
import user.meenal.ib.model.InitialVerificationResponse;
import user.meenal.ib.model.User;

public class UserServiceImpl implements UserService {

	private final UserDao userDao;
	private final GovernmentIdDao governmentIdDao;
	private final ProcessDao processDao;

	public UserServiceImpl(UserDao userDao, GovernmentIdDao governmentIdDao, ProcessDao processDao) {
		super();
		this.userDao = userDao;
		this.governmentIdDao = governmentIdDao;
		this.processDao = processDao;
	}

	@Override
	public InitialVerificationResponse registerUser(User user) {
		InitialVerificationResponse initialVerificationResponse = null;
		com.meenal.ib.entities.User userEntity = this.userDao.findUserByUniqueId(user.getUniqueId());
		if (userEntity != null) {

			if (user.getFirstName().equalsIgnoreCase(userEntity.getFirstName())
					&& user.getSecondName().equalsIgnoreCase(userEntity.getSecondName())) {

				ProcessEntity startProcess = new ProcessEntity();
				startProcess.setIbProcess(IbProcess.REGISTRATION);
				startProcess.setInitialVerificationDone(true);
				Long initiationId = this.processDao.save(startProcess).getId();
				initialVerificationResponse = new InitialVerificationResponse();
				// initialVerificationResponse.setData(initialVerificationResponse);
				initialVerificationResponse.setInitialtionId(Long.toString(initiationId));

			} else {
				initialVerificationResponse = new InitialVerificationResponse();
				Error error = new Error();
				error.setCode(400);
				error.setMessage("Initial verification failed");
			}

		}
		return initialVerificationResponse;

	}

}
