package org.example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component

public class Dog implements Pet{
    public void say(){
        System.out.println("gav");
    }
}
