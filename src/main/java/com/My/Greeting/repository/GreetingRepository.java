package com.My.Greeting.repository;


import com.My.Greeting.entity.GreetingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
//To add all the greetings
public interface GreetingRepository extends JpaRepository<GreetingEntity, Long> {
}