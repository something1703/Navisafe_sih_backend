package com.example.Navisafe_backend.report;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ReportRepository extends MongoRepository<Report, String> {
    List<Report> findByTouristId(String touristId);
    List<Report> findByAssignedAuthorityId(String authorityId);
}
