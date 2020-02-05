package com.example.demo.bean;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class config {
    private String Driver;
    private String URL;
    private String Database;
    private String UserName;
    private String Password;
    private String Topic;
}
