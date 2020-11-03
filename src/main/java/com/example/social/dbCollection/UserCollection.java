package com.example.social.dbCollection;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document
@Getter 
@Setter
@NoArgsConstructor 
@AllArgsConstructor
public class UserCollection {

    @Id  @NonNull
    private String username;

    @NonNull @Indexed(unique=true)
    private String email;

    @NonNull
    private String password;
    
    private String phone;
    
    private Date dob;
    
    private String about;
}