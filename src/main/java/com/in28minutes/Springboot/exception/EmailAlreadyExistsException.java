package com.in28minutes.Springboot.exception;

public class EmailAlreadyExistsException extends RuntimeException{

    public EmailAlreadyExistsException (String emailAlreadyExistsForUser) {

    }

    public class EmailAlreadyException extends RuntimeException{
        private String message;

        public EmailAlreadyException(String message){
            super(message);

        }

    }

}
