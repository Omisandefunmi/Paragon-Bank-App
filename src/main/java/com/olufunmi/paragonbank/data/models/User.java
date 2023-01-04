package com.olufunmi.paragonbank.data.models;

import lombok.*;
import org.springframework.data.annotation.Id;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

//@RequiredArgsConstructor


public class User {
    @NonNull private String firstName;
    private String lastName;
    private String phoneNumber;
    private String address;
    private String email;
    private String password;
    @Id private String id;
    private List<Account> accounts = new ArrayList<>();

}
