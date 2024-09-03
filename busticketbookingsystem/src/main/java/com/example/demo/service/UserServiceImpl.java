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
	
	

	/*
	 * this methoed take one parameter of type User
	 * and return string 
	 * this method check if the user is already register or not if the user is already register
	 * then it will show to user like user is already registered  */
	@Override
	public String userRegister(User user) {
	    User existingUser = userRepo.findByEmail(user.getEmail());
	    
	    if (existingUser != null) {
	        return "User is already registered";
	    }
	    
	    
	    userRepo.save(user);
	    
	    return "You have registered successfully";
	}

	
	/*
	 * this method takes two parameters both of type String 
	 * and return string 
	 * this method check the if the user email and password is equals to the database data then it will
	 * return login succeful otherwise it will return plase enter valid details*/
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