package com.bj.test07.trans.exception;

public class AccountException extends  RuntimeException {

    public AccountException() {
    }

    public AccountException(String message) {
        super(message);
    }
}