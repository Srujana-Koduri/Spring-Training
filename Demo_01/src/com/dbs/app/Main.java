package com.dbs.app;

import com.dbs.beans.MessageProvider;
import com.dbs.beans.MessageRenderer;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        try{
            MessageRenderer messageRenderer = MessageFactory.getMessageRenderer();
            MessageProvider messageProvider = MessageProvider.getMessageProvider();
        }
        catch(IOException e){

    }
}
