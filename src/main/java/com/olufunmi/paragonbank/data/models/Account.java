package com.olufunmi.paragonbank.data.models;

import lombok.*;
import org.springframework.data.annotation.Id;

import java.math.BigDecimal;
import java.security.SecureRandom;

@Data
@RequiredArgsConstructor
@NoArgsConstructor
public class Account {
    @NonNull
    private String accountName;
    @NonNull
    private String accountNumber;
    @NonNull
    private BigDecimal balance;
    @Id
    private String id;
    private String pin;

    public String generateAccNumber(){
        SecureRandom secureRandom = new SecureRandom();
        Long accountNumber = Math.abs(secureRandom.nextLong());
        accountNumber = accountNumber % 1000000000L;
        return String.valueOf(accountNumber);
    }
}
