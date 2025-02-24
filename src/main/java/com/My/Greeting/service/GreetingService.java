package com.My.Greeting.service;

import com.My.Greeting.entity.GreetingEntity;
import com.My.Greeting.repository.GreetingRepository;
import org.springframework.stereotype.Service;
import com.My.Greeting.entity.GreetingEntity;
import com.My.Greeting.repository.GreetingRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GreetingService {
    private String message;
    private final GreetingRepository greetingRepository;

    public GreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    //Method to save all the greetings
    public GreetingEntity saveGreetingRepository(String firstname, String lastName){
        //Generate message
        String message =getGreetingService(firstname , lastName);
        //Make and store the message
        GreetingEntity entity = new GreetingEntity(firstname , lastName , message);
        return greetingRepository.save(entity);
    }
    //method to get all the greetings
    public List<GreetingEntity> getAllGreetings() {
        return greetingRepository.findAll();
    }

    public String getGreetingService(String firstName, String lastName){
        if(firstName!= null && lastName != null){
            return "Hello " + firstName + " " + lastName;
        }
        if(firstName!=null){
            return "Hello "+ firstName;
        }
        if(lastName!=null){
            return "Hello "+ lastName;
        }
        return "Hello World";
    }
}

