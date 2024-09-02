package com.example.demo.service;

import com.example.demo.entity.User;

public interface UserService {
	
	public String userRegister(User user);
	
	public String userLogin(String email, String password);

}
