package com.placement.backendquantitymeasurement.mapper.impl;

import com.placement.backendquantitymeasurement.dto.UserDto;
import com.placement.backendquantitymeasurement.mapper.Mapper;
import com.placement.backendquantitymeasurement.model.User;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserResponseMapper implements Mapper<User, UserDto> {
    private final ModelMapper modelMapper;
    @Override
    public UserDto mapTo(User user) {
        return modelMapper.map(user, UserDto.class);
    }

    @Override
    public User mapFrom(UserDto userDto) {
        return modelMapper.map(userDto, User.class);
    }
}