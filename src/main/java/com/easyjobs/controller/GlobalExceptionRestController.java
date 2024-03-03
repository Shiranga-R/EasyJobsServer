package com.easyjobs.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@Slf4j
@RestControllerAdvice(annotations = RestController.class)
public class GlobalExceptionRestController extends ResponseEntityExceptionHandler
{
    @ExceptionHandler({Exception.class})
    public ResponseEntity<String> exceptionHandler(Exception exception) {
        return new ResponseEntity<>("Internal Server Error : " + exception.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
