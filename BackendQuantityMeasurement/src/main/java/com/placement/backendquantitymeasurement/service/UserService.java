package com.placement.backendquantitymeasurement.service;

import com.placement.backendquantitymeasurement.dto.LoginDto;
import com.placement.backendquantitymeasurement.dto.SignupDto;
import com.placement.backendquantitymeasurement.dto.UserDto;

public interface UserService {
	public UserDto createUser(SignupDto signupDto);
	
	public UserDto getUserById(Long id);

	String login(LoginDto loginDto);
}