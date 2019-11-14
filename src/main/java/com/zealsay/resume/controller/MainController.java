package com.zealsay.resume.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String get(){
        return "views/index.html";
    }
    @GetMapping("user/login")
    public String getLogin(){
        return "views/user/login.html";
    }
}
