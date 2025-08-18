package com.neueda.bonds_api.exception;

public class BondNotFoundException extends RuntimeException {

    public BondNotFoundException(String message){
        super(message);
    }

}
