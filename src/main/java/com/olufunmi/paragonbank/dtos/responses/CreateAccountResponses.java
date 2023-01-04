package com.olufunmi.paragonbank.dtos.responses;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CreateAccountResponses {
    private String message;
    private String accountNumber;
}
