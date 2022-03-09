package com.example.jwt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/admin")
    public String admnin(){

        return "admin";
    }

    @GetMapping("/home")
    public String login(){
        return "home";
    }
}
