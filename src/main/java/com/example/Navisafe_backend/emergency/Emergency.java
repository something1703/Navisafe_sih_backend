package com.example.Navisafe_backend.emergency;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Date;
@Document(collection = "emergencies")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Emergency {
    @Id
    private String id;
    private String touristId;             // links to Tourist.id
    private String type;                  // "sos", "medical", "security", "natural_disaster"
    private Double latitude;
    private Double longitude;
    private String status;                // "active", "responding", "resolved"
    private String assignedAuthorityId;   // links to Authority.id
    private Integer responseTime;         // in minutes
    private Date timestamp = new Date();
    private Date resolvedAt;
}