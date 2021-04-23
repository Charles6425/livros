package com.api.livros.controller.exceptions;

import com.api.livros.exceptions.ObjectNotFoundExceptions;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.ServletRequest;

@ControllerAdvice
public class ControllerExceptionsHandler {
    @ExceptionHandler(ObjectNotFoundExceptions.class)

    public ResponseEntity<StandardError> objectNotFoundException(ObjectNotFoundExceptions e, ServletRequest request) {
            StandardError error = new StandardError(System.currentTimeMillis(), HttpStatus.NOT_FOUND.value(),e.getMessage());
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
    }

}
