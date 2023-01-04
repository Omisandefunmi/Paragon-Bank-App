package com.olufunmi.paragonbank.dtos;

import lombok.Getter;

import java.math.BigDecimal;

@Getter
public class DepositRequest {
    private String accountNumber;
    private String accountName;
    private double depositAmount;

}
