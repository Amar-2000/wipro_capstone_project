package com.example.demo.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepo;

public class UserServiceImplTest {

	@InjectMocks
	UserServiceImpl userServiceImpl;
	
	@Mock
	private UserRepo userRepo;
	
	@BeforeEach
	public void setUp() {
		MockitoAnnotations.openMocks(this);
	}

	
	@Test
	public void userRegisterTest() {
		User user = new User();
		user.setPassword("password");
		userServiceImpl.userRegister(user);
	}
	
	@Test
	public void userAlreadyRegisterTest() {
		User user = new User();
		user.setPassword("password");
		when(userRepo.findByEmail(user.getEmail())).thenReturn(user);
		userServiceImpl.userRegister(user);
	}
	
	@Test
    public void testUserLogin_Success() {
        String email = "test@example.com";
        String password = "password123";
        
        
        List<User> userList = new ArrayList<>();
        User user = new User();
        userList.add(user);
        user.setEmail("test@example.com");
        user.setPassword("password123");
        
        when(userRepo.findAll()).thenReturn(userList);

        userServiceImpl.userLogin(email, password);

    }

    @Test
    public void testUserLogin_InvalidDetails() {
        String email = "wrong@example.com";
        String password = "wrongpassword";
        
        List<User> userList = new ArrayList<>();
        User user = new User();
        userList.add(user);
        user.setEmail("test@example.com");
        user.setPassword("password123");

        userServiceImpl.userLogin(email, password);

    }
}
