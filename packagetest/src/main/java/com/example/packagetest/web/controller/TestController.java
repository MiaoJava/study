package com.example.packagetest.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {



    @GetMapping
    public String getMsg() {
        return "恭喜发财";
    }
    
    
     @GetMapping
    public String getNewMsg() {
        return "new msg";
    }
}
