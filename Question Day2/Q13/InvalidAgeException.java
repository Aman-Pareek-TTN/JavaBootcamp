package com.company;

class InvalidInputException extends Exception{

    public InvalidInputException(String message) {
        super(message, null, false, true);
    }

}
