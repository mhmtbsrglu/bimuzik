package com.muzikapp.bimuzik.accountservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account/api/")
public class HelloWorld {
    @GetMapping
    public String getHelloWorld(){
        return "wake up neo.";
    }
}
