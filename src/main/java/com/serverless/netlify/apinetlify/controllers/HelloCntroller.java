package com.serverless.netlify.apinetlify.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping
public class HelloCntroller {

    @GetMapping("/hello")
    public String callme(){
        return "Hi there, welcome to netlify serverless app";
    }


}