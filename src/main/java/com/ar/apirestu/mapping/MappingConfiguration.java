package com.ar.apirestu.mapping;

import com.ar.security.mapping.mappers.UserMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration("apirestuMappingConfiguration")
public class MappingConfiguration {
    @Bean
    public UserMapper userMapper(){
        return new UserMapper();
    }
}
