package com.autocare.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@Configuration
public class CorsConfig implements RepositoryRestConfigurer {
    @Override
    public void configureRepositoryRestConfiguration(
            org.springframework.data.rest.core.config.RepositoryRestConfiguration config, CorsRegistry cors) {
        cors.addMapping("/api/**") // Applies to all /api/ endpoints
                .allowedOrigins("http://localhost:4200") // Allow Angular frontend
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS", "PATCH")
                .allowedHeaders("*")
                .allowCredentials(true);
    }
}

// This implements RepositoryRestConfigurer and overrides configureRepositoryRestConfiguration.
