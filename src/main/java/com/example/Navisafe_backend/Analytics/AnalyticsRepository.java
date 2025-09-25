package com.example.Navisafe_backend.Analytics;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
@Repository
public interface AnalyticsRepository extends MongoRepository<Analytics, String> {
    List<Analytics> findByType(String type);
    List<Analytics> findByDateBetween(Date start, Date end);
}
