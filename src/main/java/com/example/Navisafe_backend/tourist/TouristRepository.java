package com.example.Navisafe_backend.tourist;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Optional;

public interface TouristRepository extends MongoRepository<Tourist, String> {
    Optional<Tourist> findByEmail(String email);
}