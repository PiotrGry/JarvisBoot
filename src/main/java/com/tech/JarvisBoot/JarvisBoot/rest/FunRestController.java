package com.tech.JarvisBoot.JarvisBoot.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController

public class FunRestController {

    @GetMapping("/")
    public String sayHallo(){
        return "Hello World! Timeon serer is "+ LocalDateTime.now();
    }
}
