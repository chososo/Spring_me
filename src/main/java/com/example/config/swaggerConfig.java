package com.example.config;


import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class swaggerConfig {
    @Bean
    public OpenAPI swagger(){

        return new OpenAPI().info(new Info().title("spring boot lecture api").version("1.0.0").description("안녕안녕"));

    }

}
