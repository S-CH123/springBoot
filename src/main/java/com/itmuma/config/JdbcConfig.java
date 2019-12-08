package com.itmuma.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

//@Configuration
public class JdbcConfig {

    @ConfigurationProperties(prefix = "jdbc")
    @Bean
    public DataSource dataSource(){
        return new DruidDataSource();
    }
}
