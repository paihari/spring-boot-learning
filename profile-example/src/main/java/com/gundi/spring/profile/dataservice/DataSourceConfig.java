package com.gundi.spring.profile.dataservice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.xml.crypto.Data;

@Configuration
public class DataSourceConfig {

    @Bean(name = "dataSource")
    @Profile(value = "development")
    public DataSource development() {
        return new DataSource("dev-url", "90");
    }

    @Bean(name = "dataSource")
    @Profile(value = "production")
    public DataSource production() {
        return new DataSource("prod-url", "98");
    }
}
