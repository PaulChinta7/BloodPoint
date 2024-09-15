package com.bloodmap.exception;

public class UserElreadyExistException extends RuntimeException {
    public UserElreadyExistException(String userAlreadyExist) {
    super(userAlreadyExist);
    }
}
