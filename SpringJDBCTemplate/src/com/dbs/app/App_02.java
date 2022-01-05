package com.dbs.app;

import com.dbs.dap.PersonDao;
import com.dbs.entities.Person;
import com.dbs.exception.InvalidPersonIdException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App_02 {

    public static void main(String[] args) {
        ApplicationContext ctxt = new ClassPathXmlApplicationContext("spring.xml");
        PersonDao personDao = (PersonDao) ctxt.getBean("personDao");

//        try {
//            System.out.println(personDao.find(101));
//        } catch (InvalidPersonIdException e) {
//            e.printStackTrace();
//        }
        System.out.println((personDao.findAll()));
//        Person p = new Person(103,"Saketh",2500);
//        System.out.println(personDao.save(p));
        Person p = new Person(101,"Prakash",3500);
        System.out.println(personDao.edit(p));
        System.out.println((personDao.findAll()));
       //System.out.println(personDao.delete(103));
    }
}
