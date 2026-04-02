package com.placement.backendquantitymeasurement.mapper.impl;

import com.placement.backendquantitymeasurement.dto.SignupDto;
import com.placement.backendquantitymeasurement.mapper.Mapper;
import com.placement.backendquantitymeasurement.model.User;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SignupRequestMapper implements Mapper<SignupDto, User> {
    private final ModelMapper modelMapper;
    @Override
    public User mapTo(SignupDto signupDto) {
        return modelMapper.map(signupDto, User.class);
    }

    @Override
    public SignupDto mapFrom(User user) {
        return modelMapper.map(user, SignupDto.class);
    }
}