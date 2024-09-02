package com.example.demo.service;


import java.security.NoSuchAlgorithmException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepo;

@Service
public class UserServiceImpl implements UserService
{
	
	@Autowired
	private UserRepo userRepo;
	
	

	@Override
	public String userRegister(User user) {
	    User existingUser = userRepo.findByEmail(user.getEmail());
	    
	    if (existingUser != null) {
	        return "User is already registered";
	    }
	    
	    
	    userRepo.save(user);
	    
	    return "You have registered successfully";
	}

	@Override
	public String userLogin(String email, String password) {
	

		List<User> usersList = userRepo.findAll();
		

		for(User users:usersList) {
			if(users.getEmail().equals(email) && users.getPassword().equals(password)) {
				return "Login Successful";
			}
		}
		
		return "Please enter valid details";
	
	}
	

}