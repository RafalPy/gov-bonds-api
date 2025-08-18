package com.neueda.bonds_api.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class BondNotFoundException extends RuntimeException {

    public BondNotFoundException(String message){
        super(message);
    }

}
