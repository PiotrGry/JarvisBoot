package com.tech.JarvisBoot.JarvisBoot.Rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Map;

@RestController
public class FunController{

    @GetMapping("/")
    public String sayHallo(){
        return "Hello World! Time on server is "+ LocalDateTime.now();
    }


    @GetMapping("/workout")
    public String getDailyWorkout(@RequestParam(defaultValue = "help") String name){
        return "runtime changes " + name ;

    }


}


