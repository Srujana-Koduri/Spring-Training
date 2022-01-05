package com.dbs.app;

import com.dbs.beans.CollectionsDemo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext ctxt = new ClassPathXmlApplicationContext("spring.xml");
        CollectionsDemo collectionsDemo = (CollectionsDemo) ctxt.getBean("collectionsDemo");

        System.out.println("Books List: " + collectionsDemo.getBooks());
        System.out.println("Emails Set: " + collectionsDemo.getEmails());
        System.out.println("EmpData Map: " + collectionsDemo.getEmpData());
    }
}
