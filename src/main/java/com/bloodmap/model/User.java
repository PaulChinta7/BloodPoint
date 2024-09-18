package com.bloodmap.model;


import com.bloodmap.dataTranferObject.Address;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Document (collection = "User")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
    private String id;
    private String username;
    private String password;
    private String email;
    private Address address;
    private String phone;
    private String bloodtype;
    private Integer age;
    private String longitude;
    private String lattitude;
}
//