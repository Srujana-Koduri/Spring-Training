package com.dbs.app;

import com.dbs.beans.EvenOddChecker;


public class LogDemo {

    public static  void main(String args[]){
        EvenOddChecker checker = new EvenOddChecker();
        System.out.println(checker.check(4));
        System.out.println(checker.check(5));
        System.out.println(checker.check(6));
    }
}
