package com.example.Navisafe_backend.location;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Date;
@Document(collection = "locations")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Location {
    @Id
    private String id;
    private String touristId;
    private Double latitude;
    private Double longitude;
    private Integer safetyScore;
    private String riskLevel;
    private Date timestamp;
}