package com.services.userservice.infrastructure.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.services.userservice.domain.services.CreateUserService;
import com.services.userservice.infrastructure.repositories.CreateUserRepositoryImp;

@Configuration
public class BeansConfig {
	@Bean
	public CreateUserService build(CreateUserRepositoryImp repository) {
		return new CreateUserService(repository);
	}
}
