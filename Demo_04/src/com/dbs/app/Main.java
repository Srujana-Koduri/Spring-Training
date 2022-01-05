package com.dbs.app;

import com.dbs.beans.MessageRenderer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext ctxt = new ClassPathXmlApplicationContext("spring.xml");
        MessageRenderer messageRenderer = (MessageRenderer) ctxt.getBean("messageRenderer");

        messageRenderer.render();
    }
}
