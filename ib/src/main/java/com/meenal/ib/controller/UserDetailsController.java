package com.meenal.ib.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.meenal.ib.service.UserService;

import user.meenal.ib.model.InitialVerificationResponse;
import user.meenal.ib.model.User;

@RestController
@RequestMapping("/api/users")
public class UserDetailsController {
	private UserService userService;

	public UserDetailsController(UserService userService) {
		super();
		this.userService = userService;
	}

	@RequestMapping(method= RequestMethod.POST, value="/verify", produces = "application/json")
	public @ResponseBody InitialVerificationResponse verifyUserForIB(@RequestBody User user) {
		return userService.registerUser(user);
	}

	@RequestMapping("/{governmentId}")
	public void registerUserForIB(@RequestBody User user) {
		userService.registerUser(user);
	}
	
	@RequestMapping(method= RequestMethod.GET, produces = "application/json")
	public @ResponseBody List<User> getUsers() {
		return userService.getUsers();
	}

}
