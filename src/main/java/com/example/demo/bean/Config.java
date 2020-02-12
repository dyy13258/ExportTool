package com.example.demo.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value= {"classpath:config.properties"})
public class Config {
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

    public String getDriver() {
        return Driver;
    }

    public void setDriver(String driver) {
        Driver = driver;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public String getDatabase() {
        return Database;
    }

    public void setDatabase(String database) {
        Database = database;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getTopic() {
        return Topic;
    }

    public void setTopic(String topic) {
        Topic = topic;
    }

    @Override
    public String toString() {
        return "Config{" +
                "Driver='" + Driver + '\'' +
                ", URL='" + URL + '\'' +
                ", Database='" + Database + '\'' +
                ", UserName='" + UserName + '\'' +
                ", Password='" + Password + '\'' +
                ", Topic='" + Topic + '\'' +
                '}';
    }
}
