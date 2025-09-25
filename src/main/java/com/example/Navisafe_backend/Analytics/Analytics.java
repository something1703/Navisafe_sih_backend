package com.example.Navisafe_backend.Analytics;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Date;
import java.util.Map;
@Document(collection = "analytics")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Analytics {
    @Id
    private String id;
    private String type;           // e.g., "daily_stats", "incident_count", "safety_score"
    private Map<String, Object> data;  // flexible key-value storage
    private Date date;
    private Date createdAt = new Date();
}
