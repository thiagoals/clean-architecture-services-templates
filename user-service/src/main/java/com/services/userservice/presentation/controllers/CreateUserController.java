package com.services.userservice.presentation.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.services.userservice.application.CreateUserCommand;
import com.services.userservice.application.CreateUserUseCase;
import com.services.userservice.domain.entity.User;
import com.services.userservice.presentation.controllers.request.CreateUserRequest;
import com.services.userservice.presentation.controllers.response.CreateUserResponse;

@RestController
@RequestMapping(value="v1/users")
public class CreateUserController {
	
	private final CreateUserUseCase createUserUseCase;

	public CreateUserController(CreateUserUseCase createUserUseCase) {
		this.createUserUseCase = createUserUseCase;
	}

	@PostMapping
	public CreateUserResponse createUSer(@RequestBody CreateUserRequest request) throws Exception{
		//User user = createUserUseCase.execute(request.toModel());
		User user = createUserUseCase.execute(new CreateUserCommand(request.getName(), request.getUsername(), request.getEmail(), request.getPassword()));
		return CreateUserResponse.fromModel(user);
	}
}
