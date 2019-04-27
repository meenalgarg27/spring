package com.meenal.ib.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.meenal.ib.entities.User;
import com.meenal.ib.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserDetailsController {
	private final UserService userService;

	public UserDetailsController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	
	@RequestMapping("/{governmentId}")
	public void registerUserForIB(@RequestBody User user) {
//		this.userService.
		
	}
}
