package com.example.firstProject.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @RequestMapping("/hello")
    public String helloWorld(){
        return "Hello World from Spring Boot";
    }
    @RequestMapping("/goodbye")
    public String goodbyeWorld() {
        return "Goodbye World from Spring Boot";
    }
}
