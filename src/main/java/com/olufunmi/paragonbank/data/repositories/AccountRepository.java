package com.olufunmi.paragonbank.data.repositories;

import com.olufunmi.paragonbank.data.models.Account;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface AccountRepository extends MongoRepository<Account, String> {

    Optional<Account> findByAccountNumber(String accountNumber);
}
