package com.java.sbermarket.exceptions;

public class PayMethodNotFoundException extends RuntimeException {
    
    public PayMethodNotFoundException(String msg) {
        super(msg);
    }
}
