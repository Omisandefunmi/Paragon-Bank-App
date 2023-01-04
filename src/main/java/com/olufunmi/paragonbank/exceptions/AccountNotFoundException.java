package com.olufunmi.paragonbank.exceptions;

public class AccountNotFoundException extends ParagonBankException {
    public AccountNotFoundException(String message) {
        super(message);
    }
}
