package com.example.Navisafe_backend.emergency;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface EmergencyRepository extends MongoRepository<Emergency, String> {
    List<Emergency> findByTouristId(String touristId);
    List<Emergency> findByStatus(String status);
}