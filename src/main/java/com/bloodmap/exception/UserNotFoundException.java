package com.bloodmap.exception;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String userNotFoundException) {
        super (userNotFoundException);
    }
}
