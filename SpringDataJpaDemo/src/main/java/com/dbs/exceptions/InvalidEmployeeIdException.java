package com.dbs.exceptions;

public class InvalidEmployeeIdException extends Exception{
    public InvalidEmployeeIdException() {
        super();
    }

    public InvalidEmployeeIdException(String message) {
        super(message);
    }

    public InvalidEmployeeIdException(String message, Throwable cause) {
        super(message, cause);
    }

}
