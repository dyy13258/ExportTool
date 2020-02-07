package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @RequestMapping("/")
    public String index(){
        return "Login";
    }
    @RequestMapping("/Login")
    public String Login(@RequestParam("UserName")String UserName,
                        @RequestParam("Password")String Password){
        if(UserName.equals("1")){
            if (Password.equals("1")){
                return "Management";
            }
        }
        return "error";
    }
}
