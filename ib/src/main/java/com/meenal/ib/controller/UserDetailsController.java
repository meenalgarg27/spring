package com.meenal.ib.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.meenal.ib.service.UserService;

import user.meenal.ib.model.InitialVerificationResponse;
import user.meenal.ib.model.User;

@RestController
@RequestMapping("/api/users")
public class UserDetailsController {
	private final UserService userService;

	public UserDetailsController(UserService userService) {
		super();
		this.userService = userService;
	}

	@RequestMapping("/{governmentId}/verify")
	public @ResponseBody InitialVerificationResponse verifyUserForIB(@RequestBody User user) {
		return this.userService.registerUser(user);
	}

	@RequestMapping("/{governmentId}")
	public void registerUserForIB(@RequestBody User user) {
		this.userService.registerUser(user);
	}
}
