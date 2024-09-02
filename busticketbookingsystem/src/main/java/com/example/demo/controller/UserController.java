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
	
	
	@PostMapping("/register")
	public String register(@RequestBody User user) {
		
		return userService.userRegister(user);
		
	}
	
	
	@GetMapping("/login")
	public String login(@RequestParam String email, @RequestParam String password) {
		
		return userService.userLogin(email, password);
	}

}
