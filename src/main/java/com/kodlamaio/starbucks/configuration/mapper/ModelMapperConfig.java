package com.kodlamaio.starbucks.configuration.mapper;

import com.kodlamaio.starbucks.adapters.MernisServiceAdapter;
import com.kodlamaio.starbucks.business.abstracts.CustomerCheckService;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperConfig {
    @Bean
    public ModelMapper getModelMapper(){
        return new ModelMapper();
    }
}



