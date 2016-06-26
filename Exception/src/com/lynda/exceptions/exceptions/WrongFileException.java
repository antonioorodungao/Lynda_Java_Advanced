package com.lynda.exceptions.exceptions;

/**
 * Created by Oro on 6/25/2016.
 */
public class WrongFileException extends Exception {

    @Override
    public String getMessage() {
        return "You chose the wrong file!";
    }
}
