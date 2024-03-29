package com.stackroute.boot.globalcontroller;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


@ControllerAdvice
public class GlobalException extends ResponseEntityExceptionHandler {


    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> pageNotFoundHandler(Exception ex) throws RuntimeException {
        return new ResponseEntity<>("Page not found" + ex.getMessage(), HttpStatus.NOT_FOUND);
    }



}