package com.services.userservice.presentation.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.services.userservice.presentation.request.CreateUserRequest;
import com.services.userservice.presentation.response.CreateUserResponse;

@RestController
@RequestMapping(value="/user")
public class CreateUserController {

	@PostMapping(name="/createUser")
	public ResponseEntity<CreateUserResponse> createUSer(@RequestBody CreateUserRequest request){
		return null;
	}
}
