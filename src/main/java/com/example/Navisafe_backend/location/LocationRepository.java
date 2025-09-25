package com.example.Navisafe_backend.location;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface LocationRepository extends MongoRepository<Location, String> {
    List<Location> findByTouristId(String touristId);
}