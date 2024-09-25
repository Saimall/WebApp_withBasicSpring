package com.example.simpleWebApp.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String Greet(){
        return "Hello welcome to spring boot";
    }

    @RequestMapping("/about")
    public String About(){
        return "Hello welcome to About page";
    }
}
