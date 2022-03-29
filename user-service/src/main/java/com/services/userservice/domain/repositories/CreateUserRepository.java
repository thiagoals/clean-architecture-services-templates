package com.services.userservice.domain.repositories;

import com.services.userservice.domain.entity.User;

public interface CreateUserRepository {
	User execute(User user);
}
