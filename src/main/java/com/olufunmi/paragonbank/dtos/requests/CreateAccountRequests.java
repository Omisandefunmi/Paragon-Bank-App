package com.olufunmi.paragonbank.dtos.requests;

import lombok.Getter;

import java.math.BigDecimal;

@Getter
public class CreateAccountRequests {
    private String accountName;
    private String pin;
    private BigDecimal balance;


}
