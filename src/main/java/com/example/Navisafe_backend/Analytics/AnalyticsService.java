package com.example.Navisafe_backend.Analytics;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Date;
import java.util.List;
@Service
public class AnalyticsService {
    @Autowired
    private AnalyticsRepository repository;

    public Analytics generateAnalytics(Analytics analytics) {
        analytics.setCreatedAt(new Date());
        return repository.save(analytics);
    }
    public List<Analytics> getByType(String type) {
        return repository.findByType(type);
    }
    public List<Analytics> getByDateRange(Date start, Date end) {
        return repository.findByDateBetween(start, end);
    }
}
