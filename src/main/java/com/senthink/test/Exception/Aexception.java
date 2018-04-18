package com.senthink.test.Exception;

/**
 * Created by hyacinth on 2017/11/29.
 */
public class Aexception extends Exception{

    private String message;

    private static final long serialVersionUID = 1L;

    public Aexception(String errorMessage) {
        message = errorMessage;
    }

    public String getMessage() {
        return message;
    }
}
