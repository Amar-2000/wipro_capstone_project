package com.example.demo.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

public class UserControllerTest {

	@InjectMocks
	UserController userController;
	@Mock
	private UserService userService;
	
	@BeforeEach
	public void setUp() {
		MockitoAnnotations.openMocks(this);
	}
	
	@Test
	public void registerTest() {
		User user = new User();
		userController.register(user);
	}
	
	@Test
	public void loginTest() {
		String email= "abc@gmail.com";
		String password = "password";
		userController.login(email, password);
	}
}
