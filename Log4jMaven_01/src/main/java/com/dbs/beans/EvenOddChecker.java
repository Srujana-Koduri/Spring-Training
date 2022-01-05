package com.dbs.beans;

import org.apache.log4j.Logger;

public class EvenOddChecker {
    static Logger log = Logger.getLogger(EvenOddChecker.class);
    public String check(int num){
        String result="";
        log.debug("Checking the number: "+ num);
       // if(num)
        if(num%2 == 0){
            log.debug(num + " is Even");
            result = "Even";
        }
        else {
            log.info(num + " is Odd");
            result = "Odd";
        }
        return result;
    }
}
