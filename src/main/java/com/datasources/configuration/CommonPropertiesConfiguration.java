package com.datasources.configuration;

import org.apache.tomcat.jdbc.pool.PoolProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CommonPropertiesConfiguration {

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    public PoolProperties poolProperties() {
        return new PoolProperties();
    }
}