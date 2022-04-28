package com.serverless.netlify.apinetlify.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HelloControllerNet {

    @RequestMapping(value = "/callme", method = RequestMethod.GET)
    String callme(){
        return "Hi there, welcome to netlify serverless app";
    }

}
