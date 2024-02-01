package com.app.exceptions;

public class IncorrectLoginException extends RuntimeException {
    public IncorrectLoginException(String message) {
        super(message);
    }
}

