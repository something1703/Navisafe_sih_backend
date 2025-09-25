package com.example.Navisafe_backend.tourist;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "tourists")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Tourist {

    @Id
    private String id;

    private String fullName;
    private String gender;
    private Integer age;
    private String countryOfOrigin;
    private String passportOrAadharNumber;
    private String phoneNumber;
    private String email;

    private Date createdAt = new Date();
}