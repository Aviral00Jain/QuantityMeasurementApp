package com.placement.backendquantitymeasurement.config;

import com.placement.backendquantitymeasurement.repository.UserRepo;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    private final UserRepo userRepo;

    AppConfig(UserRepo userRepo) {
        this.userRepo = userRepo;
    }
    
	@Bean
	public ModelMapper modelMapper() {
		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		return mapper;
	}
}