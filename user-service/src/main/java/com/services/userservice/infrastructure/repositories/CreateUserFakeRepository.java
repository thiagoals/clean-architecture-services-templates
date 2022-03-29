package com.services.userservice.infrastructure.repositories;

import com.services.userservice.domain.entity.User;
import com.services.userservice.domain.repositories.CreateUserRepository;

public class CreateUserFakeRepository implements CreateUserRepository{

	@Override
	public User execute(User user) {
		return user;
	}

}
