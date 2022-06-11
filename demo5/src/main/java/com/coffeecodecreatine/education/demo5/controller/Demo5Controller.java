package com.coffeecodecreatine.education.demo5.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo5Controller {

    @GetMapping("helloWorld")
    String hello(){
        return "Hello World From Docker";
    }
}