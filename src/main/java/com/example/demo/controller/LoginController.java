package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 该controller负责控制页面间的相互跳转
 */
@Controller
public class LoginController {

    @RequestMapping("/Login")
    public String index(){
        return "Login";
    }

    @RequestMapping("/ToLogin")
    public String Login(@RequestParam("UserName")String UserName,
                        @RequestParam("Password")String Password){
        if(UserName.equals("1")){
            if (Password.equals("1")){
                return "Management";
            }
        }
        return "error";
    }

    @RequestMapping("/Model")
    public String Model(){
        return "Model";
    }

    @RequestMapping("/Driver")
    public String Driver(){
        return "Driver";
    }

    @RequestMapping("/Export")
    public String Export(){
        return "Export";
    }
}
