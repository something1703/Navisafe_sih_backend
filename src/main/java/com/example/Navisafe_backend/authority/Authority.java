package com.example.Navisafe_backend.authority;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Date;

@Document(collection = "authorities")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Authority {

    @Id
    private String id;

    private String name;
    private String email;
    private String password;
    private String badgeNumber;
    private String department;
    private String role;
    private Boolean isActive;
    private Date createdAt;
}
