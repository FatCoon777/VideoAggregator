package ru.netris.agregator.configuration;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ObjectMapperConfigurator {
    @Bean
    public ObjectMapper objectMapper() {
        return new ObjectMapper();
    }
}