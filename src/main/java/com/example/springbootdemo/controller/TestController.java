package com.example.springbootdemo.controller;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
    @RequestMapping("/helloworld")
    @ResponseBody
    public String helloGFG()
    {
        return "Hello Welcome to Spring Boot World!!";
    }
}
