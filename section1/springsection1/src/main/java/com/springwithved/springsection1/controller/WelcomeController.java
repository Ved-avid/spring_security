package com.springwithved.springsection1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {


    @GetMapping("/welcome")
    public String welcomeWithoutSecurtiy(){
        return "Welcome to Spring course with Security";
    }
}
