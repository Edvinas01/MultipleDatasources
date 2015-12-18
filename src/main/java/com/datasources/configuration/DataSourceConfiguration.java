package com.datasources.configuration;

import org.springframework.boot.orm.jpa.hibernate.SpringNamingStrategy;

import java.util.HashMap;
import java.util.Map;

public abstract class DataSourceConfiguration {

    protected Map<String, Object> createProperties() {
        Map<String, Object> properties = new HashMap<>();
        properties.put("hibernate.ejb.naming_strategy", SpringNamingStrategy.class.getName());
        properties.put("hibernate.hbm2ddl.auto", "update");
        return properties;
    }
}