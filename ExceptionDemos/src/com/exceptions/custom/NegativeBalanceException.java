package com.exceptions.custom;

public class NegativeBalanceException extends Throwable {
    public NegativeBalanceException() {
    }

    public NegativeBalanceException(String message) {
        super(message);
    }
}
