package com.services.userservice.infrastructure.repositories;

import org.springframework.stereotype.Repository;

import com.services.userservice.domain.entity.User;
import com.services.userservice.domain.repositories.CreateUserRepository;
import com.services.userservice.infrastructure.entities.UserJpaEntity;

@Repository
public class CreateUserRepositoryImp implements CreateUserRepository{
	
	private final CreateUserJPARepository repository;

	public CreateUserRepositoryImp(CreateUserJPARepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public User execute(User user) {
		repository.save(new UserJpaEntity(user.getName(), user.getUsername(), user.getEmail(), user.getPassword()));
		System.out.println("Salvei no banco");
		return user;
	}

}
