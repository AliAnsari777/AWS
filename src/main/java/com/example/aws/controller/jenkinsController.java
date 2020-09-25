package com.example.aws.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class jenkinsController {


    @GetMapping("/")
    public String example(){
        return "this is an example for jenkins";
    }
}
