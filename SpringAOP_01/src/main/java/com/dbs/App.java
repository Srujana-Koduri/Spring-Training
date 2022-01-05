package com.dbs;

import com.dbs.beans.Person;
import com.dbs.config.AppConfig;
import com.dbs.service.PersonService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext ctxt = new AnnotationConfigApplicationContext(AppConfig.class);
        PersonService personService = ctxt.getBean(PersonService.class);
        Person p = personService.getPerson();
        System.out.println(p);

    }
}
