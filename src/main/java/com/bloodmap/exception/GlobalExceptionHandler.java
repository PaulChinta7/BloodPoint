package com.bloodmap.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(UserNotFoundException.class)
    @ResponseBody
    public ResponseEntity<ErrorResponse> handleUserNotFoundException(UserNotFoundException exception){
        return new ResponseEntity<>(ErrorResponse.builder()
                .message(exception.getMessage())
                .status(404)
                .build(),HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(UserElreadyExistException.class)
    @ResponseBody
    public ResponseEntity<ErrorResponse> handleUserElreadyExistException(UserElreadyExistException exception){
        return new ResponseEntity<>(ErrorResponse.builder()
                .message(exception.getMessage())
                .status(400)
                .build(),HttpStatus.BAD_REQUEST);
    }

}
