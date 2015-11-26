package com.datasources;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;

@SpringBootApplication(exclude = JpaRepositoriesAutoConfiguration.class)
public class MultipleDataSourcesApplication {

    public static void main(String[] args) {
        SpringApplication.run(MultipleDataSourcesApplication.class, args);
    }
}