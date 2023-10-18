package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component

public class Person {
    private final Pet pet;
       @Autowired
        public Person (@Qualifier("dog") Pet pet) {
            this.pet = pet;
        }
public void call(){
    System.out.println("Hello, my pet");
    pet.say();
}
}
