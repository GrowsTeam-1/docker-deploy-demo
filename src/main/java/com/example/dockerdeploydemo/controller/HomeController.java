package com.example.dockerdeploydemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping
    public String hello() {
        return "Hello from docker deploy! Now it running ot elasticbeans";
    }

}
