package com.company;

public class ValidateException extends RuntimeException {

    public ValidateException() {
        super("Invalid input");
    }
}
