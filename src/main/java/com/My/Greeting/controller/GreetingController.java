package com.My.Greeting.controller;

import com.My.Greeting.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.Map;

@RestController
@RequestMapping("/greetings")
public class GreetingController {

    // UC1
    @GetMapping("/getGreeting")
    public Map<String, String> getGreeting(){
        return Collections.singletonMap("message","Hello, World!");
    }

    @PostMapping("/postGreeting")
    public Map<String, String> postGreeting(){
        return Collections.singletonMap("message", "Greeting created!");
    }

    @PutMapping("/putGreeting")
    public Map<String, String> putGreeting() {
        return Collections.singletonMap("message", "Greeting updated!");
    }

    @DeleteMapping("/deleteGreeting")
    public Map<String, String> deleteGreeting() {
        return Collections.singletonMap("message", "Greeting deleted!");
    }

    // UC2
    @Autowired
    private GreetingService greetingService;

    @GetMapping("/getGreetings")
    public Map<String, String> getGreetings(){
        return Collections.singletonMap("message", greetingService.getGreetingMessage());
    }

}
