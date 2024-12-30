package com.example.cicdtest.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cicd")
public class CicdController {

    @Value("${app.test.value}")
    private String testValue;

    @GetMapping("/test")
    public String cicdTest() {
        return "cicd with docker 'version 1.0.1'";
    }

    @GetMapping("/test1")
    public String cicdTest1() {
        return testValue;
    }
}
