package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="userdata")
public class User 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer userId;
	
	private String name;
	private String email;
	private String contact;
	private String password;
	private String confirmPass;
	
	
	public User() {
		
	}


	public User(Integer userId, String name, String email, String contact, String password, String confirmPass) {
		
		this.userId = userId;
		this.name = name;
		this.email = email;
		this.contact = contact;
		this.password = password;
		this.confirmPass = confirmPass;
	}
	

	public Integer getUserId() {
		return userId;
	}


	public void setUserId(Integer userId) {
		this.userId = userId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getContact() {
		return contact;
	}


	public void setContact(String contact) {
		this.contact = contact;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getConfirmPass() {
		return confirmPass;
	}


	public void setConfirmPass(String confirmPass) {
		this.confirmPass = confirmPass;
	}


	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", email=" + email + ", contact=" + contact + ", password="
				+ password + ", confirmPass=" + confirmPass + "]";
	}
	
	
	
	

}
