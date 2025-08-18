package com.neueda.bonds_api.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class IssuerNotFoundException extends RuntimeException{

    public IssuerNotFoundException(String message){
        super(message);
    }


}
