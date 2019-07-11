package com.meenal.ib.controller;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.meenal.ib.enums.GovernmentIdType;
import com.meenal.ib.service.UserService;

import user.meenal.ib.model.InitialVerificationResponse;
import user.meenal.ib.model.User;

public class UserDetailsControllerTest {

	@Mock
	UserService userService;

	UserDetailsController userDetailsController;

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
		userDetailsController = new UserDetailsController(userService);
	}

	@Test
	public void getIndexPage() throws Exception {
		MockMvc mockMvc = MockMvcBuilders.standaloneSetup(userDetailsController).build();

		User user = new User();
		user.setFirstName("firstname");
		user.setSecondName("lastname");
		user.setGovernmentIdType(GovernmentIdType.LICENSE);
		user.setUniqueId("123");
		InitialVerificationResponse initialVerificationResponse = new InitialVerificationResponse();
		initialVerificationResponse.setInitialtionId("1");
		when(userService.registerUser(user)).thenReturn(initialVerificationResponse);
		mockMvc.perform(post("/api/users/verify").content(asJsonString(user)).contentType(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk());
//			.andExpect(jsonPath("$.initialtionId", is("1")));
//		verify(userService, times(1)).registerUser(user);
//				.andExpect(MockMvcResultMatchers.jsonPath("$.initialtionId", is("1")));

	}

	public static String asJsonString(final Object obj) {
		try {
			return new ObjectMapper().writeValueAsString(obj);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
