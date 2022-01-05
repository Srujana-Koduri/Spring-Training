package com.dbs.app;

import com.dbs.beans.Point;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App_01 {

    public static void main(String[] args) {
        ApplicationContext ctxt = new ClassPathXmlApplicationContext("spring.xml");
        Point pointA = (Point) ctxt.getBean("pointA");
        Point pointB = (Point) ctxt.getBean("pointB");
        Point pointC = (Point) ctxt.getBean("pointC");
        System.out.println(pointA);
        System.out.println(pointB);
        System.out.println(pointC);

    }
}
