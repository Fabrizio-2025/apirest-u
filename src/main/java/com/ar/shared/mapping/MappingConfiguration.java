package com.ar.shared.mapping;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MappingConfiguration  {
    @Bean
    public EnhancedModelMapper enhancedModelMapper(){
        return new EnhancedModelMapper();
    }
}
