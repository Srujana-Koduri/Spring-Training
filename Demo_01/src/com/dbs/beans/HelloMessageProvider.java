package com.dbs.beans;

public class HelloMessageProvider implements MessageProvider{

    @Override
    public String getMessage() {
        return "Helo World";
    }
}
