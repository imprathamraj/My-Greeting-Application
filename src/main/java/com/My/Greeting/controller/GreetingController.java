package com.My.Greeting.controller;

import com.My.Greeting.service.GreetingService;
import org.springframework.web.bind.annotation.*;
import com.My.Greeting.entity.GreetingEntity;
import com.My.Greeting.model.Greeting;
import com.My.Greeting.service.GreetingService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/greeting")
public class GreetingController {
    private final GreetingService greetingService;

    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    //Extending controller to say hello world
    @GetMapping("/hello")
    public Greeting sayHello(@RequestParam(required = false) String firstName, @RequestParam(required = false) String lastName){
        String message = greetingService.getGreetingService(firstName,lastName);
        return new Greeting(message);
    }
    @GetMapping
    public Greeting getGreeting(){
        return new Greeting("Hello : this is get mapping");
    }
    @PutMapping
    public Greeting putGreeting(){
        return new Greeting("Hello : this is put mapping");
    }

    @DeleteMapping
    public Greeting deleteGreeting(){
        return new Greeting("Hello : this is delete mapping");
    }

    @PostMapping
    public Greeting postGreeting(){
        return new Greeting("Hello : this is post mapping");
    }

    //Method to save the greeting in h2
    @PutMapping("/save")
    public GreetingEntity saveGreetings(@RequestParam(required = false) String firstName, @RequestParam(required = false) String lastName){
        return greetingService.saveGreetingRepository(firstName,lastName);
    }

    //Method to get all the greetings
    @GetMapping("/all")
    public List<GreetingEntity> getAllGreetings(){
        return greetingService.getAllGreetings();
    }

}