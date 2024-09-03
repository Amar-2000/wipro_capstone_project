package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@CrossOrigin("*")
@RestController
@RequestMapping("api")
public class UserController 
{
	
	@Autowired
	private UserService userService;
	
	
	/*
	 * this method take one parameter of type user and return a string
	 * it takes the request from the client and return string as a response */
	@PostMapping("/register")
	public String register(@RequestBody User user) {
		
		return userService.userRegister(user);
		
	}
	
	/*
	 * this method take two parameter both of type String and return a string
	 * get the request from the client and
	 * return string as a response */
	@GetMapping("/login")
	public String login(@RequestParam String email, @RequestParam String password) {
		
		return userService.userLogin(email, password);
	}

}
