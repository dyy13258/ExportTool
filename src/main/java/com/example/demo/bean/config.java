package com.example.demo.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
@PropertySource(value= {"classpath:config.properties"})
@Data
public class config {
    @Value("${config.Driver}")
    private String Driver;
    @Value("${config.URL}")
    private String URL;
    @Value("${config.database}")
    private String Database;
    @Value("${config.username}")
    private String UserName;
    @Value("${config.password}")
    private String Password;
    @Value("${config.topic}")
    private String Topic;
}
