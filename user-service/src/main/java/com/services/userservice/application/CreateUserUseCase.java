package com.services.userservice.application;

import com.services.userservice.domain.entity.User;

public interface CreateUserUseCase {
	public User execute(User user);
	public User execute(CreateUserCommand command);
}
