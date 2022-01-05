package com.dbs.beans;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("messageRenderer")
public class ConsoleMessageRenderer implements MessageRenderer{

    //@Autowired
    MessageProvider messageProvider;

    public ConsoleMessageRenderer() {
        super();
        System.out.println("No-Arg Constructor");
    }

    //@Autowired
    public ConsoleMessageRenderer(MessageProvider messageProvider) {
        super();
        System.out.println("Arg-Constructor");
        this.messageProvider = messageProvider;
    }


    @Override
    public void render() {
        System.out.println(messageProvider.getMessage());
    }

    @Override
    @Autowired
    public void setMessageProvider(MessageProvider messageProvider) {
        System.out.println("Setter");
        this.messageProvider = messageProvider;
    }

    @Override
    public MessageProvider getMessageProvider() {
        return messageProvider;
    }
}
