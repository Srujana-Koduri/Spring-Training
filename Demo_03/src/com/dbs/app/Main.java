package com.dbs.app;

import com.dbs.beans.MessageProvider;
import com.dbs.beans.MessageRenderer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext ctxt = new ClassPathXmlApplicationContext("spring.xml");
        //MessageProvider messageProvider = (MessageProvider) ctxt.getBean("helloMessageProvider");
        MessageRenderer messageRenderer = (MessageRenderer) ctxt.getBean("consoleMessageRenderer");

        messageRenderer.render();
    }
}
