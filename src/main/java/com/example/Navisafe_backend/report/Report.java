package com.example.Navisafe_backend.report;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Date;
@Document(collection = "reports")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Report {
    @Id
    private String id;
    private String touristId;            // links to Tourist.id
    private String type;                 // "incident", "safety_concern", "emergency"
    private String description;
    private Double latitude;
    private Double longitude;
    private String status;               // "pending", "resolved", "investigating"
    private String priority;             // "low", "medium", "high"
    private Boolean isAnonymous;
    private Date timestamp = new Date();
    private String assignedAuthorityId;  // links to Authority.id
}