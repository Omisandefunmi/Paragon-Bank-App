package com.olufunmi.paragonbank.data.repositories;

import com.olufunmi.paragonbank.data.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserRepository extends MongoRepository<User, String> {


}
