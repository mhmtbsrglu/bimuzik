package com.muzikapp.bimuzik.accountservice.controller;

import com.muzikapp.bimuzik.accountservice.model.User;
import com.muzikapp.bimuzik.accountservice.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account/api/")
@RequiredArgsConstructor
public class HelloWorld {
    private final UserService userService;
    @GetMapping
    public String getHelloWorld(){
        return "wake up neo.";
    }

    @GetMapping("/test")
    public String testing(){
        var user = new User();
        user.setId(1);
        user.setEmail("test");
        user.setGlobalUsername("deneme");
        this.userService.createOne(user);
        return "testing";
    }

}
