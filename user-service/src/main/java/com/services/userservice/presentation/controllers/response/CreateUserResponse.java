package com.services.userservice.presentation.controllers.response;

import com.services.userservice.domain.entity.User;

public class CreateUserResponse {
	private final String name;
	private final String username;
	private final String email;
	
	public CreateUserResponse(String name, String username, String email) {
		this.name = name;
		this.username = username;
		this.email = email;
	}	

	public String getName() {
		return name;
	}

	public String getUsername() {
		return username;
	}

	public String getEmail() {
		return email;
	}

	public static CreateUserResponse fromModel(User user) {
		return new CreateUserResponse(user.getName(), user.getUsername(), user.getEmail());
	}
}
