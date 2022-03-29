package com.services.userservice.presentation.controllers.request;

import com.services.userservice.domain.entity.User;

public class CreateUserRequest {
	private final String name;
	private final String username;
	private final String email;
	private final String password;
	
	public CreateUserRequest(String name, String username, String email, String password) {
		this.name = name;
		this.username = username;
		this.email = email;
		this.password = password;
	}
	
	public String getName() {
		return name;
	}
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public String getEmail() {
		return email;
	}
	public User toModel() {
		return new User(this.name, this.username, this.email, this.password);
	}
}
