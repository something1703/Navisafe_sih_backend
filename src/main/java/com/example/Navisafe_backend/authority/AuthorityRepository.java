package com.example.Navisafe_backend.authority;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;
@Repository
public interface AuthorityRepository extends MongoRepository<Authority, String> {
    Optional<Authority> findByEmail(String email);
}