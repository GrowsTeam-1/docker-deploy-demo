package com.example.dockerdeploydemo.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class HomeControllerTest {

    @Autowired
    private HomeController homeController;

    @Test
    void hello() {
        assertEquals("Hello from docker deploy! Now it running ot elasticbeans", homeController.hello() );
    }
}