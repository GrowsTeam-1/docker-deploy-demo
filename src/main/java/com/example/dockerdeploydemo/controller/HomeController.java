package com.example.dockerdeploydemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Value("${app.value}")
    private String secretValue;

    @GetMapping
    public String hello() {
        return "Hello from docker deploy! Now it running ot elasticbeans";
    }

    @GetMapping("/secret")
    public String getSecretValue() {
        return secretValue;
    }

}
