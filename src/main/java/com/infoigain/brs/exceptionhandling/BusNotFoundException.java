package com.infoigain.brs.exceptionhandling;

public class BusNotFoundException extends RuntimeException{
    public BusNotFoundException(String message){
        super(message);
    }
}
