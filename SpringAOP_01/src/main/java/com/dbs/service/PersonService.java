package com.dbs.service;

import com.dbs.beans.Person;
import org.springframework.stereotype.Component;

@Component
public class PersonService {
    public Person getPerson(){
        System.out.println("Generating a person object to return");
        Person person = new Person(101,"Ganesh","ganesh@gmail.com");
        return person;
    }
}
