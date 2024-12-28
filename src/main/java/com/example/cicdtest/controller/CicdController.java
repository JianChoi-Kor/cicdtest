package com.example.cicdtest.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/cicd")
public class CicdController {

    @Value("${app.test.value}")
    private String testValue;

    @GetMapping("/test")
    public String cicdTest() {
        return "cicd 'version 1.0.0'";
    }

    @GetMapping("/test1")
    public String cicdTest1() {
        return testValue;
    }
}
