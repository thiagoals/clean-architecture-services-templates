package com.services.userservice.domain.services;


import com.services.userservice.application.CreateUserCommand;
import com.services.userservice.application.CreateUserUseCase;
import com.services.userservice.domain.entity.User;
import com.services.userservice.domain.repositories.CreateUserRepository;

public class CreateUserService implements CreateUserUseCase{
	
	private final CreateUserRepository repository;

	public CreateUserService(CreateUserRepository repository) {
		this.repository = repository;
	}

	@Override
	public User execute(User user) {
		return repository.execute(user);
	}

	@Override
	public User execute(CreateUserCommand command) {
		return new User(command.getName(), command.getUsername(), command.getEmail(), command.getPassword());
	}
	
}
