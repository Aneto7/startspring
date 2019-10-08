package com.example.start.services.exeptions;

public class DataIntegrityException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public DataIntegrityException(String msg){
        super(msg);
    }

    public DataIntegrityException(String msg, Throwable cause){
        super(msg, cause);
    }
}
