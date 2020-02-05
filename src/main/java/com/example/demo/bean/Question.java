package com.example.demo.bean;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class Question {
    private String Key;
    private String context;
}
