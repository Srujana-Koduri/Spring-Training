package com.dbs.beans;


import org.springframework.stereotype.Component;

@Component("messageProvider")
public class HelloMessageProvider implements  MessageProvider{


    @Override
    public String getMessage() {
        return "Good Morning";
    }
}
