package com.example.demo.bean;

import lombok.Data;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Question {
    private String Key;
    private String context;

    public String getKey() {
        return Key;
    }

    public void setKey(String key) {
        Key = key;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }
}
