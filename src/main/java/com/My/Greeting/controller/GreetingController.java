package com.My.Greeting.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.Map;

@RestController
@RequestMapping("/greetings")
public class GreetingController {

    @GetMapping
    public Map<String, String> getGreeting(){
        return Collections.singletonMap("message","Hello, World!");
    }

    @PostMapping
    public Map<String, String> postGreeting(){
        return Collections.singletonMap("message", "Greeting created!");
    }

    @PutMapping
    public Map<String, String> putGreeting() {
        return Collections.singletonMap("message", "Greeting updated!");
    }

    @DeleteMapping
    public Map<String, String> deleteGreeting() {
        return Collections.singletonMap("message", "Greeting deleted!");
    }
}
