package com.example.Navisafe_backend.Analytics;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Date;
import java.util.List;
@RestController
@RequestMapping("/api/analytics")
@CrossOrigin(origins = "http://localhost:3000")
public class AnalyticsController {

    @Autowired
    private AnalyticsService service;

    @PostMapping("/generate")
    public Analytics generate(@RequestBody Analytics analytics) {
        return service.generateAnalytics(analytics);
    }

    @GetMapping("/type/{type}")
    public List<Analytics> getByType(@PathVariable String type) {
        return service.getByType(type);
    }

    @GetMapping("/daterange")
    public List<Analytics> getByDateRange(@RequestParam Date start, @RequestParam Date end) {
        return service.getByDateRange(start, end);
    }
}
