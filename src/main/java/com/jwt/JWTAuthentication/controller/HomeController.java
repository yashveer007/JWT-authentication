package com.jwt.JWTAuthentication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HomeController {

    @GetMapping("/get")
    public String getEmp(){
        return "welcome";
    }
}
