package com.bloodmap.exception;

public class BloodRequestNotFoundException extends RuntimeException {
    public BloodRequestNotFoundException(String requestNotFoundInDb) {
        super(requestNotFoundInDb);
    }
}
