package com.example.demotest;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("test")
public class Controller {

    @GetMapping
    public String getUser(){
        return AuthTokenDetails.getUserName();
    }
}
